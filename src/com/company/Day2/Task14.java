package com.company.Day2;

public class Task14 {
    public static void main(String[] args) {
        int [] digits = new int[]{1, 2, 3, -1, -2, -3};
//        int [] digits = new int[]{1, 2, 3, 4};

        int negativeDigitsAmount = getNegativeDigitsAmount(digits);
        if (negativeDigitsAmount <= 0){
            System.out.println("No negative digits found");
            System.exit(-1);
        }

        int [] arrayOfNegativeDigits = getNegativeDigitsArray(digits, negativeDigitsAmount);
        printNegativeDigitArray(arrayOfNegativeDigits);
    }

    private static void printNegativeDigitArray(int[] arrayOfNegativeDigits) {
        for (int negativeDigit : arrayOfNegativeDigits) {
            System.out.println(negativeDigit + " ");
        }
    }

    private static int[] getNegativeDigitsArray(int[] digits, int negativeDigitsAmount) {
        int [] negativeDigitsArray = new int[negativeDigitsAmount];
        int count = 0;
        for (int digit : digits) {
            if (digit < 0){
                negativeDigitsArray[count] = digit;
                count += 1;
            }
        }
        return negativeDigitsArray;
    }

    private static int getNegativeDigitsAmount(int[] digits) {
        int count = 0;
        for (int digit : digits) {
            if (digit < 0){
                count += 1;
            }
        }
        return count;
    }
}
