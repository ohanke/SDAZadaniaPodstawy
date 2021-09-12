package com.company.Day2;

import java.util.Arrays;

public class Task15 {
    public static void main(String[] args) {
        String [] firstStrArray = {"Ala", "ma", "kota"};
        String [] secondStrArray = {"Ala", "ma", "kotaa"};

        System.out.println("Result: " + checkIfArraysAreTheSame(firstStrArray, secondStrArray));
    }

    private static boolean checkIfArraysAreTheSame(String[] firstStrArray, String[] secondStrArray) {
        if (firstStrArray.length != secondStrArray.length){
            return false;
        }
        int count = firstStrArray.length;
        for (int i = 0; i < count; i++){
            if (!firstStrArray[i].equals(secondStrArray[i])){
                return false;
            }
        }
        return true;
    }
}
