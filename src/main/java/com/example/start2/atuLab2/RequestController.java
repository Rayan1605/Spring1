package com.example.start2.atuLab2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @GetMapping("/hello2")
    public String hello2(){
        return "Hello, World";
    }

    @GetMapping("/Hello/{name}")
        public String HelloUser(@PathVariable String name){

        return "Hello " + name;

        }

 @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age ){

        return "Hello " + name + ", you are " + age + " years old.";
 }

}
