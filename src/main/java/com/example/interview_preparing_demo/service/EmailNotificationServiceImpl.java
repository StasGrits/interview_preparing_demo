package com.example.interview_preparing_demo.service;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EmailNotificationServiceImpl implements NotificationService{

    @Override
    public String sendNotification(String message) {
        return "Send message to email service: "+ message;
    }
}
