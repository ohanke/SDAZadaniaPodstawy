package com.company;

public class Zad12 {
    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        int ownResult = ownModuloImplementation(a, b);

        System.out.println("Result of " + a + " % " + b + " = " + ownResult);
        if (ownResult >= 0)
            System.out.println(ifOwnModuloImplementationIsCorrect(a, b, ownResult));
    }

    private static int ownModuloImplementation(int a, int b){
        int result = 0;
        boolean remainderFound = false;

        if (a == 0 || b == 0)
            return -1;
        else if (a > b)
            return result;

        while (!remainderFound){
            if ((a+a) < b)
            a += a;
        else{
            result = b - a;
            remainderFound = true;
        }
     }

     return result;
    }

    private static boolean ifOwnModuloImplementationIsCorrect(int a, int b, int ownResult){
        return (a % b) == ownResult;
    }
}
