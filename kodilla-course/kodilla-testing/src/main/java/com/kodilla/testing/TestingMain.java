package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        //Test Calculator
        Calculator calculator = new Calculator();
        calculator.add(6,8);
        System.out.println("The score is: " + calculator.getScore1());

        Calculator calculator1 = new Calculator();
        calculator.subtract(180,18000);
        System.out.println("The score is: " + calculator1.getScore2());

    }
}