package com.example.start2.Calculator;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
public class Answer {

    private final String operation = "operation";
    private String multiple = "";
    private final String total = "total";
    private int answer = 0;
}
