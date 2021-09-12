package com.company.Day1;

public class Zad8 {
    public static void main(String[] args) {

        printPrimeNumbers(5, 50);

    }

    public static void printPrimeNumbers(int min, int max){
        if (min < 2){
            System.out.println("Digits must be bigger than 1!");
        }else{
            for (int i = min; i < max; i++){
                boolean hasDivider = false;

                for (int j = 2; j*j <= i; j++){
                    if (i % j == 0){
                        hasDivider = true;
                        break;
                    }
                }
                if (!hasDivider)
                    System.out.println(i);
            }
        }
    }
}
