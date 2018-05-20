package com.company;

public class ExtremeValues{
    public static double maxValue (double[][] matrix){
        double maxValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] > maxValue){
                    maxValue = matrix[i][j];
                }
            }
        }
        return maxValue;
    }


    public static double minValue (double[][] matrix){
        double minValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] < minValue){
                    minValue = matrix[i][j];
                }
            }
        }
        return minValue;
    }
}
