package com.company.Extras;

public class Task3 {
    public static void main(String[] args) {
        int [] digitArray = {1, 0 ,5, 10, 0, 6};

        int [] modifiedArray = moveZerosToEndOfArray(digitArray);
        printArray(modifiedArray);
    }

    private static void printArray(int[] modifiedArray) {
        for (int digit : modifiedArray) {
            System.out.print(digit + " ");
        }
    }

    private static int[] moveZerosToEndOfArray(int[] digitArray) {
        int [] modifiedDigitArray = new int[digitArray.length];
        int counter = 0;

        for (int i = 0; i < digitArray.length; i++){
            if (digitArray[i] != 0){
                modifiedDigitArray[counter] = digitArray[i];
                counter++;
            }
        }
        return modifiedDigitArray;
    }
}


        //        int lastIndex = digitArray.length-1;
//        int movesDone = 0;
//
//        for (int i = 0; i < digitArray.length; i++){
//            if (digitArray[i] == 0){
//                int leftDigitsSum = 0;
//                for (int j = i; j < digitArray.length; j++){
//                    leftDigitsSum += digitArray[i];
//                }
//                if (leftDigitsSum == 0){
//                    break;
//                }
//
//                for (int j = (lastIndex - movesDone); j >= 0; j--){
//                    if (digitArray[j] == 0){
//                        continue;
//                    }
//                    int temp = digitArray[i];
//                    digitArray[i] = digitArray[j];
//                    digitArray[j] = temp;
//                    movesDone += 1;
//                    break;
//                }
//            }
//        }
//
//        return digitArray;
//    }
