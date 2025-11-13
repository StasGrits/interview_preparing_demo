package com.example.interview_preparing_demo.config;

import com.example.interview_preparing_demo.service.CustomUserService;
import com.example.interview_preparing_demo.service.MyCustomServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CustomUserService customUserService() {
        return new MyCustomServiceImpl();
    }
}
