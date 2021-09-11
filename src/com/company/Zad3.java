package com.company;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert first digit: ");
        int firstDigit = scanner.nextInt();
        System.out.print("\nPlease insert second digit: ");
        int secondDigit = scanner.nextInt();
        System.out.println("");

        boolean resultPointA = firstDigit > secondDigit;
        System.out.println("Is x > y " + resultPointA);
        boolean resultPointB = (firstDigit*3) > secondDigit;
        System.out.println("Is (x*3) > y " + secondDigit);
        boolean resultPointC = (++firstDigit > secondDigit++) && (--firstDigit < secondDigit++);
        System.out.println("Point C: ");
        boolean resultPointD = (firstDigit * secondDigit) % 2 == 0;
        System.out.println("Is x * y even?");

    }


}
