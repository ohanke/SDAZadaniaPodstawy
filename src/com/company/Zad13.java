package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        ArrayList<Integer> digitsList = new ArrayList<>();
        addDigits(digitsList);
        printList(digitsList);

        int digitsAmount = getDigitAmount(digitsList);
        System.out.println("Total Number Of Digits: " + digitsAmount);

        int evenDigitsAmount = getEvenDigitsAmount(digitsList);
        System.out.println("Total Number Of Even Digits: " + evenDigitsAmount);

        double arithmeticAverage = getArithmeticAverage(digitsList, digitsAmount);
        System.out.println("Arithmetic Average: " + arithmeticAverage);
    }

    private static double getArithmeticAverage(ArrayList<Integer> digitsList, int digitsAmount) {
        double result = 0;
        for (Integer integer : digitsList) {
            result += integer;
        }
        return result / digitsAmount;
    }

    private static int getEvenDigitsAmount(ArrayList<Integer> digitsList) {
        int result = 0;

        for (Integer integer : digitsList) {
            if (integer % 2 == 0)
                result += 1;
        }

        return result;
    }

    private static void printList(ArrayList<Integer> digitsList){
        for (Integer integer : digitsList) {
            System.out.print(integer + " ");
        }
        System.out.println("");
    }

    private static int getDigitAmount(ArrayList<Integer> digitsList){
        int result = 0;
        for (Integer integer : digitsList) {
            result += 1;
        }
        return result;
    }

    private static void addDigits(ArrayList<Integer> digitsList) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert digit: ");            // REDUNDANT
        int digit = scanner.nextInt();                        // REDUNDANT

        while (digit != 0){
            digitsList.add(digit);
            System.out.print("Please insert digit: ");
            digit = scanner.nextInt();
        }
    }

}
