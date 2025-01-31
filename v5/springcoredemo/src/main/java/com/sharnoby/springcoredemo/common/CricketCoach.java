package com.sharnoby.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{


    @Override
    public String getDailyWorout() {
        return "Practice fast bowling for 15 mins";
    }
}
