package com.company.Day2;

public class Task3 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        String word = "ma";

        System.out.println(getIndexOfWordInInput(input, word));
    }

    private static int getIndexOfWordInInput(String input, String word) {
        return (!word.isEmpty() && input.contains(word)) ? input.indexOf(word) : -1;
    }
}
