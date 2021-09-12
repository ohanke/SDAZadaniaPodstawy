package com.company.Day2;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość ciągu: ");
        int sequenceLength = scanner.nextInt();
        System.out.println("Podaj pierwszy element ciągu: ");
        int firstElement = scanner.nextInt();
        System.out.println("Podaj różnicę ciągu: ");
        int sequeceDifference = scanner.nextInt();

        int [] sequence = createSequence(sequenceLength, firstElement, sequeceDifference);
        for (int i : sequence) {
            System.out.print(sequence[i] + " ");
        }

    }
    public static int [] createSequence(int sequenceLength, int firstElement, int sequeceDifference){
        int [] sequence = new int[sequenceLength];
        sequence[0] = firstElement;

        for (int i = 1; i < sequenceLength; i++){
            sequence[i] = sequence[i-1]+sequeceDifference;
        }
        return sequence;
    }
}
