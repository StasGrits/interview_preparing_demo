package com.example.interview_preparing_demo.service;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class PrototypeService {
    private int counter=0;

    public int getCounter() {
        return counter++;
    }
}
