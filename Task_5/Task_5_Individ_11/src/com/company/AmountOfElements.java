package com.company;

public class AmountOfElements{
    public static int countAmountOfElements (double[] array, double a, double b){ // counts amount of elements lying in the interval [a, b] inclusively
        int counter = 0;
        for (double i : array){
            if (i >= a && i <= b){
                counter++;
            }
        }
        return counter;
    }
}