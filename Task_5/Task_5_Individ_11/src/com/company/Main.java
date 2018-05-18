package com.company;

public class Main{
    public static void main (String[] args){
        double[] array = {-34.65, 24.2, 47.98, 19.2, -0.13, 13.98, 11.71};
        double a = 20;
        double b = 50;

        int amountOfElements = AmountOfElements.countAmountOfElements (array, a, b);
        double sumOfElemAfterMax = SumOfElemAfterMax.countSumOfElemAfterMax (array);

        System.out.println ("Amount of elements lying in the given interval: " + amountOfElements);
        System.out.println ("Sum of elements after max value: " + sumOfElemAfterMax);
    }
}