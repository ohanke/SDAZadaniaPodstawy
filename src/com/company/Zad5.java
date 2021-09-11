package com.company;

public class Zad5 {
    public static void main(String[] args) {
        int firstDigit = 4;
        int secondDigit = 11;
        calculateInForLoop(firstDigit, secondDigit);
        calculateInWhileLoop(firstDigit, secondDigit);
    }

    private static void calculateInWhileLoop(int firstDigit, int secondDigit) {
        int result = 0;
        while (firstDigit <= secondDigit){
            result += firstDigit;
            firstDigit++;
        }
        System.out.println(result);
    }

    private static void calculateInForLoop(int a, int b){
        int result = 0;
        for (int i = a; i <= b; i++){
            result += i;
        }
        System.out.println(result);
    }
}
