package com.arahansa.learnspringbootchap02.chap03;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;

import static org.assertj.core.api.Assertions.assertThat;

public class ExtendedTest extends SpringBootTestApplicationTests {
    @Value("${property.test.name}")
    private String propertyTestName;

    @Test
    void testValue() {
        assertThat(propertyTestName).isEqualTo("property depth test");
    }
}
