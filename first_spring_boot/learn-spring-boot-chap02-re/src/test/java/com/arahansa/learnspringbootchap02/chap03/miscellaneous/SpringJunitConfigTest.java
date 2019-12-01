package com.arahansa.learnspringbootchap02.chap03.miscellaneous;

import com.arahansa.learnspringbootchap02.config.AppContext;
import com.arahansa.learnspringbootchap02.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.mock.env.MockPropertySource;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

// 참고 :: http://wonwoo.ml/index.php/post/1886
// https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/testing.html#integration-testing-annotations-junit-jupiter
// ExtendedWith와 ContextConfiguration 의 조합이라고 함.
// 흠 근데 SpringBootTest 랑 굳이 다른게..?
@SpringJUnitConfig(value = AppContext.class)
public class SpringJunitConfigTest {

    @Autowired
    ApplicationContext applicationContext;

    /*
    @Autowired
    HelloService helloService;
    */

    @Test
    void name() {
        List<String> strings = Arrays.asList(applicationContext.getBeanDefinitionNames());
        System.out.println("갯수 :"+strings);
        System.out.println("갯수 :"+strings.size());
        assertThat(applicationContext).isNotNull();
    }
}
