package com.arahansa.learnspringbootchap02.config;

import com.arahansa.learnspringbootchap02.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnotherContext {

    @Bean
    HelloService helloService(){
        return new HelloService();
    }
}
