package com.quocnguyen.springcoredemo.config;

import com.quocnguyen.springcoredemo.common.Coach;
import com.quocnguyen.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
