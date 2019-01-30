package com.webczw.batis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Wilber
 */
@SpringBootApplication
@MapperScan("com.webczw.batis.dao")
public class BatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(BatisApplication.class, args);
    }

}

