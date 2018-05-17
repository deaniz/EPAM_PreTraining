package com.company;

public class ArrayReverser{
    public static double[] reverseArray (double[] array){
        for (int i = 0; i < array.length / 2; i++){
            double tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }
}