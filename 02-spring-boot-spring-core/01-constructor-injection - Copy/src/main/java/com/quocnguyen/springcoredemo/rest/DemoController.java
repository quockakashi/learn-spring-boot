package com.quocnguyen.springcoredemo.rest;

import com.quocnguyen.springcoredemo.entity.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach anotherCoach;

    //define a constructor for dependency ịnection

    public DemoController() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Autowired
    public void setCoach(@Qualifier("volleyBallCoach") Coach theCoach,
                        @Qualifier("swimCoach") Coach anotherCoach) {
        myCoach = theCoach;
        this.anotherCoach = anotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWork();
    }

    @GetMapping("/check")
    public String comparePrototye() {
        return (myCoach == anotherCoach) ? "Is equals" : "Is not equals";
    }
}
