package com.quocnguyen.springcoredemo.rest;

import com.quocnguyen.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    //private Team myTeam;

    //define a constructor for dependency ịnection
    @Autowired
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWork();
    }

//    @GetMapping("/thesuccess")
//    public String getTheSuccess() {
//        return myTeam.getMySuccess();
//    }

}