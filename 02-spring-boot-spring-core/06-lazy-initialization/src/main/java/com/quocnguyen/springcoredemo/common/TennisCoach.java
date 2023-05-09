package com.quocnguyen.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());

    }
    @Override
    public String getDailyWork() {
        return "Practice you backhand volley";
    }
}
