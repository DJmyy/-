package edu.zime.iot.controller;

import edu.zime.iot.pojo.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @GetMapping("/book")
    public String a(){
        return "welcome";
    }
    @RequestMapping("/login")
    public String b(Admin a)
    {
        if (a.getUsername().equals("yxl") && a.getPassword().equals("123")){
            return "student";
        }
        return "welcome";
    }

}
