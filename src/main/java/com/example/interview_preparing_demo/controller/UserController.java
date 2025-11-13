package com.example.interview_preparing_demo.controller;


import com.example.interview_preparing_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/hello")  // ← Аннотация для endpoint
    public String helloWorld() {
        return "Hello World";  // ← Простой endpoint
    }
}
