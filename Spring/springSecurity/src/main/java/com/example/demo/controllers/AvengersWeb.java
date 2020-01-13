package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvengersWeb {


    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String user() {
        return "Avengers... Assemble";
    }
    @GetMapping("/secret-bases")
    public String admin() {
        return "list";
    }
}