package com.quocnguyen.springcoredemo.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

    @Bean
    public Coach volleyBallCoach() {
        return new VolleyBallCoach();
    }
}
