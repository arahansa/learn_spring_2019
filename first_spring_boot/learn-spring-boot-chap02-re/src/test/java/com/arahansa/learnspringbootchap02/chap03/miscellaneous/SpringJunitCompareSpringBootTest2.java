package com.arahansa.learnspringbootchap02.chap03.miscellaneous;

import com.arahansa.learnspringbootchap02.config.AppContext;
import com.arahansa.learnspringbootchap02.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SpringJunitCompareSpringBootTest2 {
    @Autowired
    ApplicationContext applicationContext;


    @Autowired
    HelloService helloService;


    @Test
    void name() {
        assertThat(applicationContext).isNotNull();
        assertThat(helloService).isNotNull();
    }

}
