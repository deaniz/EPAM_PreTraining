package com.company;

public class Main{
    public static void main (String[] args){
        // *** 5 - Sum and Multiplication ***
        int num = 11993;

        int[] array = CalcSumMult.retrieveDigits (num);
        int sum = CalcSumMult.calcSum (array);
        int mult = CalcSumMult.calcMult (array);

        System.out.println ("\n*** 5 - Sum and Multiplication ***\n");
        System.out.println ("Sum: " + sum);
        System.out.println ("Multiplication: " + mult);
    }
}