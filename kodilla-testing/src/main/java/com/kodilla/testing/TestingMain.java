package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;
public class TestingMain {
    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator newCalculator = new Calculator(8,7);

        int addMethod = newCalculator.add();

        if (addMethod == (newCalculator.getA() + newCalculator.getB())) {
            System.out.println("Test Add method ok");
        } else {
            System.out.println("Add Method Error!");
        }

        int substractMethod = newCalculator.subtract();

        if (substractMethod == (newCalculator.getA() - newCalculator.getB())) {
            System.out.println("Test substract method ok");
        } else {
            System.out.println("Subastract method Error!");
        }

    }
}


