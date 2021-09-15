package com.company.Day1;

public class Zad9 {
    public static void main(String[] args) {
        int maxRange = 10;

        printNumbers(maxRange);
    }

    private static void printNumbers(int maxRange) {
        for (int i = 1  ; i <= maxRange; i++){
            if (i % 3 == 0){
                System.out.println("Fizz");
            }
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }
            else if (i % 15 == 0){
                System.out.println("FizzBuzz");
            }
            else
                System.out.println(i);
        }
    }
}
