package com.quocnguyen.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BaseballCoach implements Coach{

    public BaseballCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());

    }
    @Override
    public String getDailyWork() {
        return "Spring 30 minutes in batting practice";
    }
}
