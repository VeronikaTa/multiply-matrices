package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int matrix1Rows = matrix1.length;
        int matrix1Columns = matrix1[1].length;
        int matrix2Columns = matrix2[1].length;
        int iteratorRow;
        int [][] matrixResult = new int[matrix1Rows][matrix2Columns];

        for(iteratorRow = 0; iteratorRow < matrix1Rows; iteratorRow++){
            for(int i = 0; i < matrix2Columns; i++){
                for(int j = 0; j < matrix1Columns; j++){
                    matrixResult[iteratorRow][i] += matrix1[iteratorRow][j] * matrix2[j][i];
                }
            }
        }

        return matrixResult;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] a = {
                {0, 12345},
                {4509, 0},
                {3, 567} };

        int[][] b = {
                {653, 0, 25353},
                {0, 61, 6} };

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
