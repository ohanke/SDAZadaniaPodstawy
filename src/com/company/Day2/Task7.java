package com.company.Day2;

public class Task7 {
    public static void main(String[] args) {
        String userInput = "Ala ma kota";

        int blankSpacesAmount = countBlankSpacesInString(userInput);
        System.out.println(countProcentageOfBlankSpaces(userInput, blankSpacesAmount));
    }

    private static double countProcentageOfBlankSpaces(String userInput, int blankSpacesAmount) {
        return ((double) blankSpacesAmount / userInput.length()) * 100;
    }

    private static int countBlankSpacesInString(String userInput) {
        int count = 0;
        for (int i = 0; i < userInput.length(); i++){
            if (userInput.charAt(i) == ' '){
                count += 1;
            }
        }
        return count;
    }
}
