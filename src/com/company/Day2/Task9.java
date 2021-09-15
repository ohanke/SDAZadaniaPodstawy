package com.company.Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        List<String> userStringList = new ArrayList<>();

        do {
            if (userInput.isEmpty()){
                System.out.println("No input");
                userInput = scanner.nextLine();
                continue;
            }
            putUserInputIntoList(userInput, userStringList);
            userInput = scanner.nextLine();
        }while (!userInput.equals("Enough"));


        int longestElement = getIndexOfLongestString(userStringList);
        System.out.println(userStringList.get(longestElement));
    }

    private static int getIndexOfLongestString(List<String> userStringList) {
        int index = 0;
        int biggestSize = userStringList.get(0).length();

        for (int i = 1; i < userStringList.size(); i++) {
            if (userStringList.get(i).length() > biggestSize) {
                biggestSize = userStringList.get(i).length();
                index = i;
            }
        }
        return index;
    }

    private static void printUserList(List<String> userStringList) {
        for (String string : userStringList) {
            System.out.println(string + " ");
        }
    }

    private static List<String> putUserInputIntoList(String userInput, List<String> userList) {
        userList.add(userInput);
        return userList;
    }
}
