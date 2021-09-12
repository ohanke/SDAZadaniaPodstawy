package com.company.Day2;

public class Task6 {
    public static void main(String[] args) {
        String userInput = "Ala ma kota";
        char serachedCharacter = 'a';
        System.out.println("Result: " + getIndexOfWordInInput(userInput, serachedCharacter));
    }

    private static int getIndexOfWordInInput(String input, char searchedCharacter) {
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == searchedCharacter){
                return i;
            }
        }
        return -1;
    }
}
