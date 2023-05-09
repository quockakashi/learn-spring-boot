package com.quocnguyen.springcoredemo.common;

import com.quocnguyen.springcoredemo.common.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CriketCoach implements Coach {
    @Override
    public String getDailyWork() {
        return "Practice fast bowling for 15 minutes";
    }
}
