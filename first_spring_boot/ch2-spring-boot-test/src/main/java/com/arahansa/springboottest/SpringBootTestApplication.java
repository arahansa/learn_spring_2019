package com.arahansa.springboottest;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.bind.PropertySourcesPlaceholdersResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySource;
import org.springframework.core.env.PropertySources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@SpringBootApplication
public class SpringBootTestApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringBootTestApplication.class, args);
    }

    @Autowired
    Environment env;


    @Bean
    InitializingBean initializingBean(){
        return () ->{
            String property = env.getProperty("property.test.name");
            System.out.println("property : "+property);
        };
    }

    /*@PostConstruct
    public void setup(){
        System.out.println("propertyTestName");
        System.out.println(propertyTestName);
    }


    @GetMapping
    public String helloWorld33(){
        System.out.println("propertyTestName");
        System.out.println(propertyTestName);
        return "Hello World?----";
    }



    @GetMapping("/test")
    public String a(){
        return propertyTestName;
    }*/


}
