package com.company;

import java.util.Random;

public class Main{
    public static void main (String[] args){
        double leftBound = -19.93;
        double rightBound = 10.9;
        double[][] array = new double[3][5];

        initialize (array, leftBound, rightBound);
        double maxValue = ExtremeValues.maxValue (array);
        double minValue = ExtremeValues.minValue (array);

        System.out.printf ("Max value: %.3f\n", maxValue);
        System.out.printf ("Min value: %.3f", minValue);
    }


    private static void initialize (double[][] array, double leftBound, double rightBound){ // [leftBound; rightBound)
        Random ran = new Random ();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = ran.nextDouble () * (rightBound - leftBound) + leftBound;
            }
        }
    }
}

/*
for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println ();
        }
 */