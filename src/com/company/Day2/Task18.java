package com.company.Day2;

import java.util.Random;

public class Task18 {
    public static void main(String[] args) {
        int [] randomDigits = new int[10];

        getRandomDigits(randomDigits);
        printArray(randomDigits, "Random Digits");

        int [] distinctDigits = new int[]{0,1,2,3,4,5,6,7,8,9};
        int [] repeats = getDigitsRepeats(randomDigits, distinctDigits);
        printResult(distinctDigits, repeats);
    }

    private static void printResult(int [] distinctDigits, int [] repeats){
        for (int i = 0; i < distinctDigits.length; i++){
            System.out.println("Digit: " + distinctDigits[i] + " is repeating: " + repeats[i] + " times.");
        }
    }

    private static int[] getDigitsRepeats(int[] randomDigits, int[] distinctDigits) {
        int [] digitsRepeats = new int[distinctDigits.length];

        for (int i = 0; i < distinctDigits.length; i++){
            int repeatCounter = 0;
            for (int j = 0; j < randomDigits.length; j++){
                if (distinctDigits[i] == randomDigits[j]){
                    repeatCounter+=1;
                }
            }
            digitsRepeats[i] = repeatCounter;
        }
        return digitsRepeats;
    }

    private static void printArray(int[] digitsArray, String arrayName) {
        System.out.print(arrayName + ": ");
        for (int digits : digitsArray) {
            System.out.print(digits + " ");
        }
        System.out.println("");
        System.out.println("");
    }

    private static int [] getRandomDigits(int[] digitsArray) {
        Random rand = new Random();
        for (int i = 0; i < digitsArray.length; i++){
            digitsArray[i] = rand.nextInt(10);
        }
        return digitsArray;
    }
}



