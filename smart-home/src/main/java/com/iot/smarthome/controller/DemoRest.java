package com.iot.smarthome.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRest {
    @GetMapping("/")
    public String GetDemo(){
        return "The API is working";
    }
}
