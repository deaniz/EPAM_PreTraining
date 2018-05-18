package com.company;

public class ExtremeValues{
    public static double maxValue (double[] array){
        double maxValue = array[0];
        for (double i : array){
            if (i > maxValue){
                maxValue = i;
            }
        }
        return maxValue;
    }

    public static double minValue (double[] array){
        double minValue = array[0];
        for (double i : array){
            if (i < minValue){
                minValue = i;
            }
        }
        return minValue;
    }
}
