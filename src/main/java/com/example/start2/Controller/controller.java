package com.example.start2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World";
    }
}
