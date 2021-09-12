package com.company.Day2;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] strInputArray = scanner.nextLine().split(" ");

        int [] arayOfDigits = convertStrToIntArray(strInputArray);
        printArray(arayOfDigits);

        int [] reversedArray = reverseOrderOfDigitArray(arayOfDigits);
        printArray(reversedArray);
    }

    private static int [] reverseOrderOfDigitArray(int[] digitArray) {
        int temp = 0;
        for (int i = 0; i < digitArray.length/2; i++){
            temp = digitArray[i];
            digitArray[i] = digitArray[digitArray.length-(i+1)];
            digitArray[digitArray.length-(i+1)] = temp;
        }
        return digitArray;
    }

    private static void printArray(int[] arayOfDigits) {
        System.out.print("Input: ");
        for (int digit : arayOfDigits) {
            System.out.print(digit + " ");
        }
    }

    private static int[] convertStrToIntArray(String[] strInputArray) {
        int [] convertedArray = new int[strInputArray.length];
        for (int i = 0; i < convertedArray.length; i++){
            convertedArray[i] = Integer.parseInt(strInputArray[i]);
        }
        return convertedArray;
    }
}
