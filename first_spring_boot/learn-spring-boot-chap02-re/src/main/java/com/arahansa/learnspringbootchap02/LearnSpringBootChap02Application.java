package com.arahansa.learnspringbootchap02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class LearnSpringBootChap02Application {

    public static void main(String[] args) {
        SpringApplication.run(LearnSpringBootChap02Application.class, args);
    }

}
