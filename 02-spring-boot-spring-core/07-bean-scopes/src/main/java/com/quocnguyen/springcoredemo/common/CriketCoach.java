package com.quocnguyen.springcoredemo.common;

import com.quocnguyen.springcoredemo.common.Coach;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CriketCoach implements Coach {

    @Override
    public String getDailyWork() {
        return "Practice fast bowling for 15 minutes";
    }
}
