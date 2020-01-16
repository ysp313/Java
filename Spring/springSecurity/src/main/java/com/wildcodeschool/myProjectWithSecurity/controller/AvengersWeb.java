package com.wildcodeschool.myProjectWithSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AvengersWeb {

    @ResponseBody
    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }

    @ResponseBody
    @GetMapping("/avengers/assemble")
    public String user() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String admin() {
        return "list";
    }
}