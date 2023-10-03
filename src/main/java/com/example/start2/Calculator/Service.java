package com.example.start2.Calculator;
@org.springframework.stereotype.Service
public class Service implements CalculateInterface {

    public int multiply(int a,int b){
        return a*b;
    }

    public int Add(int a,int b){
        return a+b;
    }

    public int Minus(int a,int b){
        return a-b;
    }

    public int Divide(int a,int b){
        return a/b;
    }
}
