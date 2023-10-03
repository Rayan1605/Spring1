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
    public int Calculate(@RequestParam int num1,@RequestParam int num2,@RequestParam String operation)


}
