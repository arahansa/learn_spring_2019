package com.arahansa.learnspringbootchap02.controller;

import com.arahansa.learnspringbootchap02.pojo.FruitProperty;
import com.arahansa.learnspringbootchap02.pojo.FruitPropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {
    @Value("${propertyTest}")
    private String propertyTestName;
    @Autowired
    FruitProperty fruitProperty;
    @Autowired
    ApplicationContext applicationContext;

    @GetMapping("/bean-list")
    public List<String> beanList(){
        return Arrays.asList(applicationContext.getBeanDefinitionNames());
    }

    @GetMapping("hi")
    public String helloWorld33(){
        System.out.println("propertyTestName");
        System.out.println(propertyTestName);
        return "Hello World?----";
    }

    @GetMapping("/fruit")
    public FruitProperty fruitProperty(){
        return fruitProperty;
    }

}
