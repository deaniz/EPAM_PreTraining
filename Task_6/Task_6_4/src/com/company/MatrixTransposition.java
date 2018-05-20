package com.company;

public class MatrixTransposition{
    public static double[][] transposeMatrix (double[][] matrix){
        double[][] trMatrix = new double[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                trMatrix[j][i] = matrix[i][j];
            }
        }
        return trMatrix;
    }
}
