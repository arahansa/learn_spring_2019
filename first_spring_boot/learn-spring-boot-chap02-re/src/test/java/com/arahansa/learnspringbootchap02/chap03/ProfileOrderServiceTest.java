package com.arahansa.learnspringbootchap02.chap03;

import com.arahansa.learnspringbootchap02.config.AppContext;
import com.arahansa.learnspringbootchap02.service.OrderService;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;


public class ProfileOrderServiceTest {

    @Nested
    @SpringBootTest(classes = AppContext.class)
    static class DefaultTest {
        @Autowired OrderService orderService;

        @Test
        void orderServiceTest() {
            String arahansa = orderService.ordered("아라한사");
            assertThat(arahansa).isEqualTo("hello default 아라한사");
        }
    }

    @Nested
    @SpringBootTest(classes = AppContext.class)
    @ActiveProfiles("dev")
    static class DevTest {
        @Autowired OrderService orderService;

        @Test
        void orderServiceTest() {
            String arahansa = orderService.ordered("아라한사");
            assertThat(arahansa).isEqualTo("hello dev 아라한사");
        }
    }
}
