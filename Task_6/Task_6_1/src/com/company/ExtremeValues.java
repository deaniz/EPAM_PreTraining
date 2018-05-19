package com.company;

public class ExtremeValues{
    public static double maxValue (double[][] array){
        double maxValue = array[0][0];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] > maxValue){
                    maxValue = array[i][j];
                }
            }
        }
        return maxValue;
    }


    public static double minValue (double[][] array){
        double minValue = array[0][0];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] < minValue){
                    minValue = array[i][j];
                }
            }
        }
        return minValue;
    }
}
