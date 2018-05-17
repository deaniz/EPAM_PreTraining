package com.company;

public class LocMinimum{
    public static int findLocMinimum(double[] array){
        for (int i = 1; i < array.length - 1; i++){
            if (array[i] < array[i - 1] && array[i] < array[i + 1]){
                return i;
            }
        }
        return -1;
    }
}
