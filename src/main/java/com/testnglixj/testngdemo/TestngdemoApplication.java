package com.testnglixj.testngdemo;

import com.testngdemo.pojo.DemoUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@ComponentScan({"com.testngdemo.controller", "com.testngdemo.pojo"})
public class TestngdemoApplication {

    @Bean
    public DemoUser getDemoUser(){
        return new DemoUser();
    }


    public static void main(String[] args) {
        SpringApplication.run(TestngdemoApplication.class, args);
    }

}
