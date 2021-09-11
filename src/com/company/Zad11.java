package com.company;

import java.util.Random;
import java.util.Scanner;

public class Zad11 {
    private static final int NUMBER_RANGE = 101;

    public static void main(String[] args) {
        int hiddenDigit = getRandomNumber();
        boolean gameOver = false;


        while (!gameOver){
            int playersGuess = getGuess();

            if (playersGuess > hiddenDigit)
                System.out.println("Too much");
            else if (playersGuess < hiddenDigit)
                System.out.println("Not enough");
            else{
                System.out.println("Bingo!");
                gameOver = true;
            }
        }

    }

    private static int getRandomNumber(){
        Random random = new Random();
        int digit = random.nextInt(NUMBER_RANGE);
        return digit;
    }

    private static int getGuess() {
        System.out.print("Enter a digit from (0 - 100): ");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();

        if (guess<0 || guess>NUMBER_RANGE){
            System.out.println("Invalid number!");
            getGuess();
        }

        return guess;
    }
}
