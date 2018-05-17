package com.company;

public class DifferentDigits{
    public static final int DECIMAL_DIGITS_AMOUNT = 10; // from 0 to 9

    public static int countDifferentDigits (int num){
        int[] digits = new int[DECIMAL_DIGITS_AMOUNT];
        int counter = 0;
        while (num > 0){
            digits[num % 10]++;
            num /= 10;
        }
        for (int i : digits){
            if (i != 0){
                counter++;
            }
        }
        return counter;
    }
}