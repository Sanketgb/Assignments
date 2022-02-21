package com.springsecurity.assignmentQ1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String helloWorld() {
    	return ("<h1>Hello World</h1>");
    }

}