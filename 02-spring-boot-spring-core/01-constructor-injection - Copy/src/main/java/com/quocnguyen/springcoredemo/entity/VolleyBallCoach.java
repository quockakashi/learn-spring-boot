package com.quocnguyen.springcoredemo.entity;

public class VolleyBallCoach implements Coach{

    public VolleyBallCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWork() {
        return "Practice with your hand everyday!";
    }
}
