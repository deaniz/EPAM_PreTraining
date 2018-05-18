package com.company;

public class SumOfElemAfterMax{
    public static double countSumOfElemAfterMax (double[] array){
        double maxValue = array[0];
        int numOfMaxVal = 0;
        double sum = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] > maxValue){
                maxValue = array[i];
                numOfMaxVal = i;
            }
        }
        for (int i = numOfMaxVal + 1; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
}