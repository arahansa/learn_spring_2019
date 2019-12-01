package com.arahansa.learnspringbootchap02.config;

import com.arahansa.learnspringbootchap02.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppContext {

    @Profile("default")
    static class DefaultContext{
        @Bean
        OrderService orderService(){
            return name -> "hello default "+ name;
        }
    }

    @Profile("dev")
    static class DevContext{
        @Bean
        OrderService orderService(){
            return name -> "hello dev "+ name;
        }
    }


}
