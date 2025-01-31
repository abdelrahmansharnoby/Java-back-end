package com.sharnoby.springboot.demo.myapp.rip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

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
}
