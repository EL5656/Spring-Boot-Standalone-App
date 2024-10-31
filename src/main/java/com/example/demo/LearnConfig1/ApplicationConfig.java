package com.example.demo.LearnConfig1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public MyFirstClass myFirstBean() {
        return new MyFirstClass("First bean");
    }
}
