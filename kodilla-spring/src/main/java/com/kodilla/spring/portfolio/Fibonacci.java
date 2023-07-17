package com.kodilla.spring.portfolio;

public class Fibonacci {

    public static int fibonacciCalculator(int i) {
        int result;

        if(i == 0) {
            result = 0;
        } else if (i == 1) {
            result = 1;
        } else {
            result = (i - 1) + (i - 2);
        }
        return result;
    }
}
