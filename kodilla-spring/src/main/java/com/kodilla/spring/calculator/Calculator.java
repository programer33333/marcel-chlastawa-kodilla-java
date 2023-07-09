package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public double add(double a, double b) {
        double result = a + b;
        display.displayValue(result, "Adding");
        return result;
    }

    public double sub(double a, double b) {
        double result = a - b;
        display.displayValue(result, "Subtraction");
        return result;
    }

    public double mul(double a, double b) {
        double result = a * b;
        display.displayValue(result, "Multiplication");
        return result;
    }

    public double div(double a, double b) {
        double result = a / b;
        display.displayValue(result, "Dividing");
        return  result;
    }
}
