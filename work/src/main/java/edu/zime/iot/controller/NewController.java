package edu.zime.iot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewController
{
    @GetMapping("/new")
    public String b(){
        return "course";
    }
    @GetMapping("/new1")
    public String c(){
        return "score";
    }
    @GetMapping("/new2")
    public String d(){
        return "user";
    }
    @GetMapping("/new3")
    public String e(){
        return "welcome";
    }
    @GetMapping("/new4")
        public String f(){
        return "add";
    }
}
