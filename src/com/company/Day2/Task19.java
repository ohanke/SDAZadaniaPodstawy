package com.company.Day2;

public class Task19 {
    public static void main(String[] args) {
        int [][] firstArray = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] secondArray = {{10,-1,5},{-25,6,6},{12,8,9}};

        int [][] biggerArray = getBiggerArray(firstArray, secondArray);
        printArray(biggerArray);
        System.out.println("Biggest value: " + getTheBiggestValue(firstArray, secondArray));
        System.out.println("Lowest value: " + getTheLowestValue(firstArray, secondArray));
    }

    private static int getTheLowestValue(int[][] firstArray, int[][] secondArray) {
        int min = Integer.MAX_VALUE;

        for (int[] array : firstArray) {
            for (int digit : array) {
                if (digit < min){
                    min = digit;
                }
            }
        }

        for (int[] array : secondArray) {
            for (int digit : array) {
                if (digit < min){
                    min = digit;
                }
            }
        }
        return min;
    }

    private static int getTheBiggestValue(int[][] firstArray, int[][] secondArray) {
        int max = Integer.MIN_VALUE;

        for (int[] array : firstArray) {
            for (int digit : array) {
                if (digit > max){
                    max = digit;
                }
            }
        }

        for (int[] array : secondArray) {
            for (int digit : array) {
                if (digit > max){
                    max = digit;
                }
            }
        }
        return max;
    }

    private static void printArray(int[][] biggerArray) {
        System.out.print("Bigger array is: ");
        for (int[] array : biggerArray) {
            for (int digit : array) {
                System.out.print(digit + " ");
            }
        }
        System.out.println("");
    }

    private static int [][] getBiggerArray(int[][] firstArray, int[][] secondArray) {
        int firstArraySum = 0;
        int secondArraySum = 0;

        for (int i = 0; i < firstArray.length; i++){
            for (int j = 0; j < firstArray.length; j++){
                firstArraySum += firstArray[i][j];
            }
        }
        for (int i = 0; i < secondArray.length; i++){
            for (int j = 0; j < secondArray.length; j++){
                secondArraySum += secondArray[i][j];
            }
        }
        return firstArraySum > secondArraySum ? firstArray : secondArray;
    }
}
