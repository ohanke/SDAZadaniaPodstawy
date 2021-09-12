package com.company.Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        List<String> userStringList = new ArrayList<>();

        while (!userInput.equals("Enough")) {
            putUserInputIntoList(userInput, userStringList);
            userInput = scanner.nextLine();
        }

        getIndexOfLongestString(userStringList);
    }

    private static int getIndexOfLongestString(List<String> userStringList) {
        int index = 0;
        for (int i = 0; i < userStringList.size(); i++) {
//            if (userStringList.length() > index) {
//                index =
//            }
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
