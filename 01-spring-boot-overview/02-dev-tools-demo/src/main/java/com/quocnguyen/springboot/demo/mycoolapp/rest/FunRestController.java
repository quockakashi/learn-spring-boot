package com.quocnguyen.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/" that return "HelloWorld"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
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
