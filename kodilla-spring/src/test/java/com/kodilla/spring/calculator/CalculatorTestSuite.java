package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        calculator.add(4, 2);
        calculator.sub(4, 2);
        calculator.mul(4, 2);
        calculator.div(4, 2);
        //Then
        //do nothing

    }
}
