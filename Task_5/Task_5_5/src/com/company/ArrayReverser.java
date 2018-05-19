package com.company;

public class ArrayReverser{
    public static void reverseArray (double[] array){
        double tmp;
        for (int i = 0; i < array.length / 2; i++){
            tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }
}