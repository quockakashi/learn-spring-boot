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
    private Coach anotherCoach;

    //private Team myTeam;

    //define a constructor for dependency ịnection
    @Autowired
public DemoController(
            @Qualifier("criketCoach") Coach theCoach,
            @Qualifier("criketCoach") Coach theAnotherCoach) {
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }


    @GetMapping("/check")
    public String getCheck() {
        return (myCoach == anotherCoach) ? "singleton" : "prototype";
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
