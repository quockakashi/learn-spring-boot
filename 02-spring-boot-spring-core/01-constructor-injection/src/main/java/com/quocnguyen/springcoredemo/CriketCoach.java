package com.quocnguyen.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CriketCoach implements Coach{
    @Override
    public String getDailyWork() {
        return "Practice fast bowling for 15 minutes";
    }
}
