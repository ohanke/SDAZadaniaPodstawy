package com.company.Extras;

public class Task5 {
    public static void main(String[] args) {
        int userInput = 14;

        displayFibonacci(userInput);
    }

    private static void displayFibonacci(int userInput) {
        int [] fiboArray = new int[userInput];
        fiboArray[0] = 1;
        fiboArray[1] = 1;

        if (userInput == 0 || userInput == 1){
            System.out.println("1");
        }else {
            for (int i = 2; i < fiboArray.length; i++){
                fiboArray[i] = fiboArray[i-1] + fiboArray[i-2];
            }
            System.out.println(fiboArray[userInput-1]);
        }
    }
}
