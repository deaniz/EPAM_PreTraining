package com.company;

public class Main{
    public static void main (String[] args){
        double[] array = {4.2, 76.98, 12.0, 1.113, -34.65, 119.2};

        double maxValue = ExtremeValues.maxValue (array);
        double minValue = ExtremeValues.minValue (array);

        System.out.println ("Max value: " + maxValue);
        System.out.println ("Min value: " + minValue);
    }
}
