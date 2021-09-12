package com.company.Day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad2 {
    private static final float PI = 3.14F;

    public static void main(String[] args) {
        float radius = getDiameterFromUser();
        float circumferenceOfACircle = calculateCircumferenceOfACircle(radius);
        float areaOfACircle = calculateAreaOfACircle(radius);

        System.out.println("Circumference Of A Circle: " + circumferenceOfACircle);
        System.out.printf("Circumference Of A Circle: %.2f\n", circumferenceOfACircle);
        System.out.format("Circumference Of A Circle: %.2f\n", circumferenceOfACircle);

        System.out.println("Area Of A Circle: " + areaOfACircle);
        System.out.printf("Area Of A Circle: %.2f\n", areaOfACircle);
        System.out.format("Area Of A Circle: %.2f\n", areaOfACircle);

    }

    private static float calculateAreaOfACircle(float radius) {
        return PI * (radius/2) * (radius/2);
    }

    private static float calculateCircumferenceOfACircle(float radius) {
        return 2*PI*(radius/2);
    }

    private static float getDiameterFromUser(){
        Scanner scanner = new Scanner(System.in);
        float diameter = 0;
        try {
            System.out.print("Please insert diameter: ");
            diameter = scanner.nextFloat();
        } catch (InputMismatchException exception){
            System.out.println("Insert only digits!");
            System.exit(1);
        }
        return diameter;
    }


}
