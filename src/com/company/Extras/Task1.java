package com.company.Extras;

public class Task1 {

    private static final int VALUE_UPPER_A_IN_ASCII = 65;
    private static final int VALUE_UPPER_Z_IN_ASCII = 90;
    private static final int DIFF_UPPER_AND_LOWER = 32;

    public static void main(String[] args) {
        String input = "Ala ma kota, a kot ma myszkę.";
        String [] inputArray = input.split(" ");
        System.out.println(replaceFirstCharacter(inputArray));
    }

    private static String replaceFirstCharacter(String [] input){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length; i++){
            char firstChar = input[i].charAt(0);
            if (firstChar >= VALUE_UPPER_A_IN_ASCII && firstChar <= VALUE_UPPER_A_IN_ASCII){
                result.append(input[i]);
            }else{
                result.append((char)(firstChar - DIFF_UPPER_AND_LOWER));
                result.append(input[i], 1, input[i].length());
            }
        }
        return result.toString();
    }
}
