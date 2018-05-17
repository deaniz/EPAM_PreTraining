package com.company;

public class ArithmeticGeometricAverage {
    public static double calcArithmAv(double[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum / array.length;
    }

    public static double calcGeomAv (double[] array){
        double mult = 1;
        for (int i = 0; i < array.length; i++){
            mult *= array[i];
        }
        mult = mult > 0 ? mult : -mult;
        return Math.pow (mult, 1.0 / array.length);
    }
}
