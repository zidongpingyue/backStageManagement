package com.yuan.homeworkservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.yuan.homeworkservice.dao")
public class HomeworkServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeworkServiceApplication.class, args);
    }

}
