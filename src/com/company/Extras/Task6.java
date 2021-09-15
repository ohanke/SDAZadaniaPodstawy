package com.company.Extras;

public class Task6 {
    public static void main(String[] args) {
        int [][] multiplicationTable = createMatrix(10, 10);

        printMultiplicationTable(multiplicationTable);
    }

    private static int[][] createMatrix(int x, int y) {
        int [][] matrix = new int[x][y];
        int size = matrix.length;

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                matrix[i][j] = (j+1)*(i+1);
            }
        }
        return matrix;
    }

    private static void printMultiplicationTable(int[][] multiplicationTable) {
        for (int[] array : multiplicationTable) {
            for (int digit : array) {
                System.out.print(digit + " ");
            }
            System.out.println();
        }
    }
}
