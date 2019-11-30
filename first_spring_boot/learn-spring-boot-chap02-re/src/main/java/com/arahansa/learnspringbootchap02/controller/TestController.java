package com.arahansa.learnspringbootchap02.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${propertyTest}")
    private String propertyTestName;

    @GetMapping("hi")
    public String helloWorld33(){
        System.out.println("propertyTestName");
        System.out.println(propertyTestName);
        return "Hello World?----";
    }

}
