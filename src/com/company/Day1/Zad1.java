package com.company.Day1;

public class Zad1 {
    public static void main(String[] args) {
        displayWordUsingDecimalFormat();
    }

    private static void displayWordUsingDecimalFormat(){
        char s = 0b01010011; //binary 83
        char d = 68;
        char a = 0x41;  //hex 65

        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }
}
