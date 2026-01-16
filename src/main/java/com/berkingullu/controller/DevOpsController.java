package com.berkingullu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


@RestController
@RequestMapping

public class DevOpsController {


    @GetMapping
    public String index(){
        return "Hello Devops";
    }

    @GetMapping("info")
    public String info(){
        return "Info: " + LocalDateTime.now();
    }
}
