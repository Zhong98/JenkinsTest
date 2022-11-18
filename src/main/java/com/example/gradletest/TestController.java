package com.example.gradletest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("helloword")
    public String helloword(){
        return "this is a docker demo";
    }
}

