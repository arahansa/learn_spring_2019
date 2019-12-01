package com.arahansa.learnspringbootchap02.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@ConfigurationProperties("fruit")
public class FruitProperty {
    private List<Fruit> list;
}
