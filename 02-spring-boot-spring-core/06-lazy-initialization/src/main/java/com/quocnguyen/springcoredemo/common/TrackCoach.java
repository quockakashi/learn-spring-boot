package com.quocnguyen.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    public TrackCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());

    }
    @Override
    public String getDailyWork() {
        return "Run a hard 5k!";
    }
}
