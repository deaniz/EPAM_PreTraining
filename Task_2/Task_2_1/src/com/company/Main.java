package com.company;

public class Main{
    public static void main (String[] args){
        // *** 1 - Weight of a dinosaur ***
        double weight = 3205.50; // weight in kilograms

        double wMg = WeightConverter.calcWeightMg (weight); // weight in milligrams
        double wGrams = WeightConverter.calcWeightG (weight); // weight in grams
        double wTons = WeightConverter.calcWeightT (weight); // weight in tons

        System.out.println ("\n*** 1 - Weight of a dinosaur ***\n");
        System.out.printf ("Weight in milligrams: %.0f\n", wMg);
        System.out.printf ("Weight in grams: %.0f\n", wGrams);
        System.out.println ("Weight in tons: " + wTons);

    }
}
