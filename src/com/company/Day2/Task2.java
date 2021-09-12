package com.company.Day2;

public class Task2 {
    public static void main(String[] args) {
        String input = "programowanie";
        String prefix = "pro";
        String suffix = "nie";

        System.out.println(checkIfIsBegginingWithPrefix(input, prefix));
        System.out.println(checkIfIsEndingWithSuffix(input, suffix));
    }

    private static boolean checkIfIsEndingWithSuffix(String input, String suffix) {
        return input.endsWith(suffix);
    }

    private static boolean checkIfIsBegginingWithPrefix(String input, String prefix) {
        return input.startsWith(prefix);
    }
}
