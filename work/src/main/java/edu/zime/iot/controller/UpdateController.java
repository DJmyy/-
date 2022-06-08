package edu.zime.iot.controller;

import edu.zime.iot.dao.UserDao;
import edu.zime.iot.pojo.Course;
import edu.zime.iot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UpdateController
{
    @Autowired
    UserDao userDao;
    @PostMapping("/add")
    public String st(User c)
    {
        userDao.add(c);
        return "redirect:/get";
    }
    @GetMapping("/delete/{ID}")
    public String de(@PathVariable("ID")String id)
    {
        userDao.chart3(id);
        return "redirect:/get2";
    }
    @PostMapping("/update")
    public String up(User d)
    {
        userDao.update(d);
        return "redirect:/get";
    }
    @GetMapping("/new5/{ID}")
    public String g(@PathVariable("ID")String id, Model model)
    {
        User a=userDao.u(id);
        model.addAttribute("m",a);
        return "update";
    }
}
