package com.arahansa.learnspringbootchap02.chap03;

import com.arahansa.learnspringbootchap02.LearnSpringBootChap02Application;
import com.arahansa.learnspringbootchap02.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(
        properties = {"property.value=propertyTest"},
        classes = LearnSpringBootChap02Application.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class SpringBootTestApplicationTests {

//    @Value("${value}")
//    private String value;


    @Value("${property.value}")
    private String propertyValue;

    @Test
    void contextLoads() {
        // assertThat(value).isEqualTo("test");
        assertThat(propertyValue).isEqualTo("propertyTest");
    }
}
