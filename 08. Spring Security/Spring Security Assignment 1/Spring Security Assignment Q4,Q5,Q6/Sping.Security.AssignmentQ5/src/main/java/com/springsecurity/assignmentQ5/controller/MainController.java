package com.springsecurity.assignmentQ5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("login-fail")
    public String handleFailedLogin() {
        System.out.println("A User has failed to login");

        return "redirect:/signin?error";
    }
}