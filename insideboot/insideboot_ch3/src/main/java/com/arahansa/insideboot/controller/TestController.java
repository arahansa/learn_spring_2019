package com.arahansa.insideboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    ApplicationContext applicationContext;
    @Autowired
    DataSource dataSource;

    @PostConstruct
    public void setup() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println("--- hikari info ---");
        System.out.println(connection.getMetaData().getURL());
        System.out.println(connection.getMetaData().getUserName());
    }

    @GetMapping("/bean-list")
    public List<String>  beanList() throws SQLException {
        return Arrays.asList(applicationContext.getBeanDefinitionNames());
    }
}
