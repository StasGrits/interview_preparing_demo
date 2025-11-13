package com.example.interview_preparing_demo.service;


import org.springframework.stereotype.Service;

@Service
public class SmsNotificationServiceImpl implements NotificationService{
    @Override
    public String sendNotification(String message) {
        return "Send message to SMS: " + message;
    }
}
