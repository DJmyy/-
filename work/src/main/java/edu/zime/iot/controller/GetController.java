package edu.zime.iot.controller;

import edu.zime.iot.dao.CourseDao;
import edu.zime.iot.dao.ScoreDao;
import edu.zime.iot.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetController
{
    @Autowired
    CourseDao courseDao;
    @GetMapping("/get")
    public String get(Model model)
    {
        model.addAttribute("course1",courseDao.chart());
        return "course";
    }
    @Autowired
    ScoreDao scoreDao;
    @GetMapping("/get1")
    public String get1(Model model)
    {
        model.addAttribute("score1",scoreDao.chart1());
        return "score";
    }
    @Autowired
    UserDao userDao;
    @GetMapping("/get2")
    public String get2(Model model)
    {
        model.addAttribute("user1",userDao.chart2());
        return "user";
    }
}
