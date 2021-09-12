package com.company.Day2;

import java.util.Arrays;

public class Task17 {
    private static final int HOW_MANY_DIGITS = 10;

    public static void main(String[] args) {
        int [] digitArray = new int[]{2, 4, 6, 0, -5, -7, 3, 9, -4, -5};

        int [] sortedDiditArray = sortDigitArray(digitArray);
        printArray(sortedDiditArray);
    }

    private static void printArray(int[] digitArray){
        System.out.print("Result: ");
        for (int digit : digitArray) {
            System.out.print(digit + " ");
        }
    }

    private static int [] sortDigitArray(int[] digitArray) {
        Arrays.sort(digitArray);
        return digitArray;
    }
}
