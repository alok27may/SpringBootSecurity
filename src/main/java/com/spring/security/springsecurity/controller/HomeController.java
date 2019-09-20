package com.spring.security.springsecurity.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        return "welcome to home page";
    }

    @RequestMapping("/user/{username}")
    public String userDetails(@PathVariable String username) {
        return "Hello! " + username + ". How's the Josh?";
    }

}
