package com.bee.sample.ch1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HellowordController {
    @RequestMapping("/")
    @ResponseBody
    public  String say(){
        return "hello spring boot!";
    }
}
