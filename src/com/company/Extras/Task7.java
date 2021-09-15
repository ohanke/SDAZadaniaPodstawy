package com.company.Extras;

public class Task7 {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Sum of elements on diagonals: " + getDiagonalSum(matrix));
        System.out.println("Sum of elements on edges: " + getEdgesSum(matrix));
    }

    private static int getEdgesSum(int[][] matrix) {
        int sum = 0;
        int size = matrix.length;

        for (int i = 0; i < size; i ++){
            for (int j = 0; j < size; j++){
                if (i == 1 && j == 1){
                    continue;
                }
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    private static int getDiagonalSum(int[][] matrix) {
        int sum = 0;
        int size = matrix.length;
        for (int i = 0; i < size; i++){
            sum += matrix[i][i];
        }
        for (int i = size-1; i >= 0; i--){
            sum += matrix[i][i];
        }
        return sum;
    }
}
