package com.example.interview_preparing_demo.controller;

import com.example.interview_preparing_demo.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdvancedNotificationController {

    private final NotificationService emailService;
    private final NotificationService smsService;

    @Autowired
    public AdvancedNotificationController(
            @Qualifier("emailNotificationServiceImpl") NotificationService emailService,
            @Qualifier("smsNotificationServiceImpl")NotificationService smsService) {
        this.emailService = emailService;
        this.smsService = smsService;
    }


    @GetMapping("/notify/email")
    public String sendEmail() {
        return emailService.sendNotification("Тестовое сообщение");
    }

    @GetMapping("/notify/sms")
    public String sendSms() {
        return smsService.sendNotification("Тестовое сообщение");
    }

}
