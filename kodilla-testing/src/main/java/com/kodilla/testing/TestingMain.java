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

        Calculator newCalculator = new Calculator();

        int addMethod = newCalculator.add(8,7);
        int subatractMethod = newCalculator.subtract(5,4);
        if(addMethod == 15 && subatractMethod == 1) {
            System.out.println("Calculator test ok");
        } else {
            System.out.println("Calculator has error!");
        }
    }
}


