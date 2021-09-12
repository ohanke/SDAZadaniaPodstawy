package com.company.Day2;

public class Task11StrBuilder {
    public static void main(String[] args) {
        String input = "kayak";
        String result = new StringBuilder(input).reverse().toString();
        System.out.println(result.equals(input));
    }
}
