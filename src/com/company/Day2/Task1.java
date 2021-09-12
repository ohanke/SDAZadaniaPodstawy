package com.company.Day2;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(getLastCharacterFromStringV1(""));

    }

    private static char getLastCharacterFromStringV1(String input){
        if (input.isEmpty() || input.isBlank())
            System.exit(-1);
        input = input.trim();
        int lastPositions = input.length()-1;
        return input.charAt(lastPositions);
    }

    private static String getLastCharacterFromStringV2(String input){
        return null;
    }

}
