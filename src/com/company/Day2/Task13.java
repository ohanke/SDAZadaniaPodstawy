package com.company.Day2;

import java.util.Arrays;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] strInputArray = scanner.nextLine().split(" ");
        int [] arayOfDigits = convertStrToIntArray(strInputArray);

        int max = getMaxValue(arayOfDigits);
        int min = getMinValue(arayOfDigits);
        int totalSum = getTotalSum(arayOfDigits);

        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);
        System.out.println("Total sum: " + totalSum);
    }

    private static int[] convertStrToIntArray(String[] strInputArray) {
        int [] convertedArray = new int[strInputArray.length];
        for (int i = 0; i < convertedArray.length; i++){
            convertedArray[i] = Integer.parseInt(strInputArray[i]);
        }
        return convertedArray;
    }


    private static int getTotalSum(int[] arayOfDigits) {
//        return Arrays.stream(arayOfDigits).sum();
        int result = 0;
        for (int digit : arayOfDigits) {
            result += digit;
        }
        return result;
    }

    private static int getMinValue(int[] arayOfDigits) {
        int min = Integer.MAX_VALUE;
        for (int digit : arayOfDigits) {
            if (digit < min){
                min = digit;
            }
        }
        return min;
    }

    private static int getMaxValue(int[] arayOfDigits) {
        int max = Integer.MIN_VALUE;
        for (int digit : arayOfDigits) {
            if (digit > max){
                max = digit;
            }
        }
        return max;
    }
}
