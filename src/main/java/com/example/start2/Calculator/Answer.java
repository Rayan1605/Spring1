package com.example.start2.Calculator;

import lombok.Data;

@Data
public class Answer {

    private final String operation = "operation";
    private String multiple = "";
    private final String total = "total";
    private int answer = 0;
}
