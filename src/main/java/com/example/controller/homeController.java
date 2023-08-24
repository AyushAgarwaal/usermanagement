package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.model.userModel;

@Controller
public class homeController {

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @GetMapping("/addUser")
    public String register(@ModelAttribute userModel user) {
        System.out.println(user.toString());
        return "addUser";
    }
}
