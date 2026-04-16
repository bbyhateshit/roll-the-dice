package com.pluralsight;

public class RollTheDice {
    public static void main(String[] args) {

        Dice dice = new Dice();

        int roll1 = dice.roll();
        int roll2 = dice.roll();

// Counters

        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 1; i <= 100; i++) {

            int sum = roll1 + roll2;

            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + "  Sum: " + sum);


        }

    }
}

