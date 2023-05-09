package com.quocnguyen.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWork() {
        return "Spring 30 minutes in batting practice";
    }
}
