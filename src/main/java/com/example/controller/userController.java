package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.userModel;
import com.example.service.userService;

@RestController
@RequestMapping(value = "/")
public class userController {

    @Autowired
    private userService userServicee;

    @GetMapping(value = "/getAllUsers")
    public Object[] getAllUsersComplete() {
        return userServicee.findAllUsersComplete();
    }

    @GetMapping
    public userModel[] getAllUsers() {
        return userServicee.findAllUsers();
    }
}
