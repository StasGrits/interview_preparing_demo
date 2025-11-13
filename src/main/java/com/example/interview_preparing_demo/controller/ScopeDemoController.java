package com.example.interview_preparing_demo.controller;


import com.example.interview_preparing_demo.service.PrototypeService;
import com.example.interview_preparing_demo.service.SingletonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScopeDemoController {

    @Autowired
    private ApplicationContext applicationContext;


    @GetMapping("/scopes/singleton")
    public String singletonTest() {
        SingletonService singletonService1 = applicationContext.getBean(SingletonService.class);
        SingletonService singletonService2 = applicationContext.getBean(SingletonService.class);
        return "Singleton 1 counter: " + singletonService1.getCounter() + "\n" +
                "Singleton 2 counter: " + singletonService2.getCounter() + "\n" +
                "Это один и тот же объект: " + (singletonService1 == singletonService2);
    }

    @GetMapping("/scopes/prototype")
    public String prototypeTest() {
        PrototypeService prototypeService1 = applicationContext.getBean(PrototypeService.class);
        PrototypeService prototypeService2 = applicationContext.getBean(PrototypeService.class);
        return "Prototype 1 counter: " + prototypeService1.getCounter() + "\n" +
                "Prototype 2 counter: " + prototypeService2.getCounter() + "\n" +
                "Это один и тот же объект: " + (prototypeService1 == prototypeService2);
    }

}
