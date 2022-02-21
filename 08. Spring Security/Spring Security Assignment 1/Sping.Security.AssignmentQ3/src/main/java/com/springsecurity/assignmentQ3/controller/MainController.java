package com.springsecurity.assignmentQ3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/signin")
    public String login() {
        return "login.html";
    }

    @GetMapping("/admin")
    @ResponseBody
    public String hellWorld() {
    	return ("<h1>Hello World</h1>");
    }
}