package com.quocnguyen.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;
    // expose "/" that return "HelloWorld"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/team_coach_info")
    public String teamAndCoachInfo() {
        return coachName + " " + teamName;
    }

    @GetMapping("/workout")
    public String getHardWork() {
        return "Hello Universal!";
    }

    @GetMapping("/quocdeptrai")
    public String printTheRealFact() {
        return "Anh Quoc Dep Trai Vl!";
    }
}
