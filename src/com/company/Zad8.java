package com.company;

public class Zad8 {
    public static void main(String[] args) {

        getPrimeNumbers(5, 50);
    }

    private static void getPrimeNumbers(int min, int max){
        if (min < 2){
            System.out.println("Error");
        } else{
            boolean hasDivider = false;
            for (int i = 2; i*i <= max; i++){
                if (min % i == 0){
                    hasDivider = true;
                    break;
                }
                if (!hasDivider)
                    System.out.println(i);
            }
        }
    }
}
