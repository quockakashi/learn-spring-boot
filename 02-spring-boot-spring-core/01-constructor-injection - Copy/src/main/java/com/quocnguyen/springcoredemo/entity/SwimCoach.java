package com.quocnguyen.springcoredemo.entity;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{

    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @PostConstruct
    void initDoingSomethingStuff() {
        System.out.println("In initDoingSomethingStuff(): " + getClass().getSimpleName());
    }

    @PreDestroy
    void cleanDoingSomethingStuff() {
        System.out.println("In cleanDoingSomethingStuff()" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWork() {
        return "Swim everyday 1000m";
    }
}
