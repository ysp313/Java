package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyProjectApplication.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "<a href = /doctor>Spring01</a>"+ "</br>"+ "<a href = /doctor2>Spring02</a>";

    }
    @RequestMapping("/doctor")
    @ResponseBody
    public String indexB() {
        return "<ul>"
        +"<li><a href = /doctor/1>Doctor 1</a></li>"
        +"<li><a href = /doctor/2>Doctor 2</a></li>"
        +"<li><a href = /doctor/3>Doctor 3</a></li>"
        +"<li><a href = /doctor/4>Doctor 4</a></li>";
    }
    @RequestMapping("/doctor/1")
    @ResponseBody
    public String index1() {
        return "William Hartnell";
    }
    @RequestMapping("/doctor/2")
    @ResponseBody
    public String index2() {
        return "Patrick Troughton";
    }
    @RequestMapping("/doctor/3")
    @ResponseBody
    public String index3() {
        return "Jon Pertwee";
    }
    @RequestMapping("/doctor/4")
    @ResponseBody
    public String index4() {
        return "Tom Baker";
    }

}