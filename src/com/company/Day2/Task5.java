package com.company.Day2;

import java.util.Locale;

public class Task5 {
    public static void main(String[] args) {
        String userInput = "Ala ma kota";
        char searchedCharacter = 'a';
        System.out.println("Result: " + countCharacterGiven(userInput, searchedCharacter));
    }

    private static int countCharacterGiven(String userInput, char searchedCharacter) {
        int count = 0;
        for (int i = 0; i < userInput.length(); i++){
            if (userInput.charAt(i) == searchedCharacter){
                count+=1;
            }
        }
        return count;
    }
}
