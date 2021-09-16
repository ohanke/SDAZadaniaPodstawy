package com.company.Day1;

public class Zad12 {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int ownResult = ownModuloImplementation(a, b);

        System.out.println("Result of " + a + " % " + b + " = " + ownResult);
        if (ownResult >= 0)
            System.out.println(ifOwnModuloImplementationIsCorrect(a, b, ownResult));
    }

    private static int ownModuloImplementation(int a, int b){
        //4%3 != 0
        if (b == 0)
            return -1;
        return ((a < b) ? a : 0);
    }

    private static boolean ifOwnModuloImplementationIsCorrect(int a, int b, int ownResult){
        return (a % b) == ownResult;
    }
}
