package com.company.Extras;

public class Task2 {
    public static void main(String[] args) {
        char firstChar = 'A';
        char secondChar = 'z';

        int distanceBetweenChars = getDistanceBetweenChars(firstChar, secondChar);
        System.out.println(distanceBetweenChars);
    }

    private static int getDistanceBetweenChars(char firstChar, char secondChar) {
        int counter = 0;

        firstChar = Character.toLowerCase(firstChar);
        secondChar = Character.toLowerCase(secondChar);

        for (char i = firstChar; i < secondChar; i++){
            counter++;
        }
        return counter;
    }
}
