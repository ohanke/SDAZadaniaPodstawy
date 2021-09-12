package com.company.Day2;

public class Task4 {
    public static void main(String[] args) {
        String userInput = "Ala ma, kota. a kot, ma Ale";
        System.out.println(modifyInput(userInput));
    }

    private static String modifyInput(String userInput) {
        return userInput.replaceAll("[.]", "-STOP-").replaceAll(",", "-STOP-");
    }
}
