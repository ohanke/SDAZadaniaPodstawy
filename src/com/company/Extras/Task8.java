package com.company.Extras;

public class Task8 {
    private static final int COLUMN = 10;
    private static final int ROW = 3;

    public static void main(String[] args) {
        int[][] digitArray = new int[ROW][COLUMN];
        fillWithBaseNumbers(digitArray);
        getPowerOfDigit(digitArray, 2);
        getPowerOfDigit(digitArray, 3);
        printMatrix(digitArray);
    }

    private static void fillWithBaseNumbers(int[][] digitArray) {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                digitArray[i][j] = j + 1;
            }
        }
    }

    private static void getPowerOfDigit(int[][] digitArray, int powerOf) {
        int currentRow = powerOf-1;
        for (int i = 0; i < COLUMN; i++){
            digitArray[currentRow][i] = calculatePowerOf(digitArray[0][i], powerOf);
        }
    }

    private static int calculatePowerOf(int digit, int powerOf) {
        int multiplier = digit;
        for (int i = 1; i < powerOf; i++) {
            digit *= multiplier;
        }
        return digit;
    }


    private static void printMatrix(int[][] digitArray) {
        for (int[] array : digitArray) {
            for (int digit : array) {
                System.out.print(digit + " ");
            }
            System.out.println(" ");
        }
    }
}
