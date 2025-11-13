package com.example.interview_preparing_demo.controller;

import com.example.interview_preparing_demo.service.CustomUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomServiceController {

    private final CustomUserService customUserService;

    @Autowired
    public CustomServiceController(CustomUserService customUserService) {
        this.customUserService = customUserService;
    }

    @GetMapping("/my-service")
    public String myService() {
        return customUserService.actionPerformance();
    }
}
