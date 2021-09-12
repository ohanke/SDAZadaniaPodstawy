package com.company.Day1;

public class Zad6 {
    public static void main(String[] args) {
        int multiplier = 6;
        int minMultiplicand = 2;
        int maxMultiplicand = 5;

        printMultiplicationTable(multiplier, minMultiplicand, maxMultiplicand);
    }

    private static void printMultiplicationTable(int multiplier, int minMultiplicand, int maxMultiplicand) {
        for(;minMultiplicand <= maxMultiplicand; minMultiplicand++){
            int result = multiplier;
            result *= minMultiplicand;
            System.out.println(multiplier + " x " + minMultiplicand + " = " + result);
        }
    }
}
