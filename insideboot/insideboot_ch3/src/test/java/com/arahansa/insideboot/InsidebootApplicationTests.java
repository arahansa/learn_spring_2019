package com.arahansa.insideboot;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class InsidebootApplicationTests {

    @Autowired
    SqlSessionTemplate sqlSession;

    @Test
    void testSqlSessioin(){
        System.out.println(sqlSession.toString());
    }

}
