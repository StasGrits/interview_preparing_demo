package com.example.interview_preparing_demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigCheckController {

    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/config/check")
    public String checkConfig() {
        return "App Name: " + appName + "\n" +
                "App Version: " + appVersion + "\n" +
                "Server Port: " + serverPort;
    }
}
