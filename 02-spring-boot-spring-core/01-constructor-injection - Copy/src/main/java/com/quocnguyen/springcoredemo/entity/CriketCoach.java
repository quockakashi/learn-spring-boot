package com.quocnguyen.springcoredemo.entity;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CriketCoach implements Coach {

    public CriketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWork() {
        return "Practice fast bowling for 15 minutes";
    }
}
