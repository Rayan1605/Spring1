package com.example.start2.Calculator;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class calculate {
    CalculateInterface cal;

    @GetMapping("/calculate")
    public Answer Calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation) {
     int answer;
        switch (operation){
            case "add":
                answer = cal.Add(num1,num2);
                break;
            case "subtract":
                answer = cal.Minus(num1,num2);
                break;
            case "multiply":
                answer = cal.multiply(num1,num2);
                break;
            case "divide":
                answer = cal.Divide(num1,num2);
                break;
            default:


        }

    }

}
