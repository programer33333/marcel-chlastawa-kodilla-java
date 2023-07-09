package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {
    public double displayValue(double val, String typeOfOperation) {
        System.out.println(typeOfOperation + " result : " + val);
        return val;
    }
}
