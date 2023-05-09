package com.quocnguyen.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Override
    public String getDailyWork() {
        return "Practice you backhand volley";
    }
}
