package com.company;

public class Main{
    public static void main (String[] args){
        double[] array = {144.2, 7.98, 12.0, 1.113, -34.65, 119.2};

        double[] reversedArray = ArrayReverser.reverseArray (array);

        System.out.print ("Reversed array: ");
        for (double i : reversedArray){
            System.out.print (i + "  ");
        }
    }
}