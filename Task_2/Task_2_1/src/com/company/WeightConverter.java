package com.company;

public class WeightConverter{
    public static final int COEF1 = 1_000_000;
    public static final int COEF2 = 1_000;


    public static double calcWeightMg (double weight){ // from kg to milligrams
        return weight * COEF1;
    }

    public static double calcWeightG (double weight){ // from kg to grams
        return weight * COEF2;
    }

    public static double calcWeightT (double weight){ // from kg to tons
        return weight / COEF2;
    }
}
