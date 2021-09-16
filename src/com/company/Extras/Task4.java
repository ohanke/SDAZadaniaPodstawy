package com.company.Extras;

public class Task4 {

    private static final char SPACE = ' ';
    private static final char STAR = '*';
    private static final int WAVE_HEIGHT = 4;

    public static void main(String[] args) {
        int waveLenght = 50;

        char [][] matrix = new char[WAVE_HEIGHT][waveLenght];
        fillMatrixWithSpaces(matrix, waveLenght);
        addStarsToMatrix(matrix, waveLenght);
        printMatrix(matrix, waveLenght);
    }

    private static void addStarsToMatrix(char[][] matrix, int waveLenght) {
        int counter = 0;
        boolean goingDown = true;

        for (int i = 0; i < waveLenght; i++) {
            if (goingDown){
                matrix[counter][i] = STAR;
                if (counter == WAVE_HEIGHT-1){
                    goingDown = false;
                    continue;
                }
                counter++;
            }else {
                matrix[counter][i] = STAR;
                if (counter == 0){
                    goingDown = true;
                    continue;
                }
                counter--;
            }
        }
    }

    private static void fillMatrixWithSpaces(char[][] matrix, int waveLenght) {
        for (int i = 0; i < WAVE_HEIGHT; i++){
            for (int j = 0; j < waveLenght; j++){
                matrix[i][j] = SPACE;
            }
        }
    }

    private static void printMatrix(char[][] matrix, int waveLenght) {
        for (int i = 0; i < WAVE_HEIGHT; i++){
            for (int j = 0; j < waveLenght; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
