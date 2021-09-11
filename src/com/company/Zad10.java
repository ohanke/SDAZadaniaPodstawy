package com.company;

import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String [] separatedNumbersFromInput = scanner.nextLine().split("");
        int [] convertedIntArray = convertStringToInt(separatedNumbersFromInput);
        int result = getArraySum(convertedIntArray);
        System.out.println("Sum of those numbers: " + result);
    }

    private static int getArraySum(int[] convertedIntArray) {
        int result = 0;
        for (int digit : convertedIntArray) {
            result += digit;
        }
        return result;
    }

    private static int [] convertStringToInt(String [] stringArray){
        int [] intArray = new int[stringArray.length];

        for (int i = 0; i < intArray.length; i++){
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }
}