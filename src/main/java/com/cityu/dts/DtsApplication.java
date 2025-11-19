package com.cityu.dts;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cityu.dts.dao")
public class DtsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DtsApplication.class, args);
    }

}
