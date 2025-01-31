package com.sharnoby.springboot.demo.myapp.rip;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }
    @GetMapping("/workout")
    public String getdailyworkout(){
        return "Run a hard 5kkkk";
    }
    @GetMapping("/rich")
    public String getrich(){
        return "12k to you buddy";
    }
    @GetMapping("/teaminfo")
    public String getTeam(){
        return "coach is " + coachName + " team is: " + teamName;
    }
}
