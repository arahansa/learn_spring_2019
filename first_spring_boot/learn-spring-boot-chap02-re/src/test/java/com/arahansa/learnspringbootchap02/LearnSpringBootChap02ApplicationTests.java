package com.arahansa.learnspringbootchap02;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class LearnSpringBootChap02ApplicationTests {

    @Value("${property.test.name}")
    private String propertyTestName;

    @Value("${propertyTest}")
    private String propertyTest;

    @Value("${noKey:default value}")
    private String defaultValue;

    @Value("${propertyTestList}")
    private String[] propertyTestArray;

    @Value("#{'${propertyTestList}'.split(',')}")
    private List<String> propertyTestList;

    @Test
    void testValue() {
        assertThat(propertyTestName).isEqualTo("property depth test");
        assertThat(propertyTest).isEqualTo("test");
        assertThat(defaultValue).isEqualTo("default value");
        assertThat(propertyTestArray[0]).isEqualTo("a");
        assertThat(propertyTestArray[1]).isEqualTo("b");
        assertThat(propertyTestArray[2]).isEqualTo("c");

        assertThat(propertyTestList.get(0)).isEqualTo("a");
        assertThat(propertyTestList.get(1)).isEqualTo("b");
        assertThat(propertyTestList.get(2)).isEqualTo("c");

    }

}
