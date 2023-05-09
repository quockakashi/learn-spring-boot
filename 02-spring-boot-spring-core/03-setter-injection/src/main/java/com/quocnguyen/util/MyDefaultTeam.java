package com.quocnguyen.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyDefaultTeam implements Team{
    @Override
    public String getMySuccess() {
        return "We will win the WorldCup 2026";
    }
}
