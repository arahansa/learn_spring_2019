package com.arahansa.learnspringbootchap02.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@Data
@ConfigurationProperties("fruit")
public class FruitProperty {
    private List<Map> list;
}
