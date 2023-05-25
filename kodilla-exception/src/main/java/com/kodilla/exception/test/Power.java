package com.kodilla.exception.test;

public class Power {

    public int power(int a, int b) {
        int result = 1;

        for(int n = 0; n < b ; n++) {
            if(b == 0) {
                result = 1;
            } else {
                result *=  a;
            }
        }
        return result;
    }
}
