package com.example.start2.Calculator;

import com.example.start2.Calculator.Answer;
import com.example.start2.Calculator.CalculateInterface;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class calculate {
    Service cal;

    @GetMapping("/calculate/{num1}/{num2}/{operation}")
    public Answer Calculate(@PathVariable int num1, @PathVariable int num2, @PathVariable String operation) {
     int answer = 0;
        switch (operation) {
            case "add" -> answer = cal.Add(num1, num2);
            case "subtract" -> answer = cal.Minus(num1, num2);
            case "multiply" -> answer = cal.multiply(num1, num2);
            case "divide" -> answer = cal.Divide(num1, num2);
            default -> {
            }
        }
          return new Answer(operation,answer);

    }

}
