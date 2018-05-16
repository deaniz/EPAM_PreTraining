package com.company;

public class DifferentDigits{
    public static int countDifferentDigits(int num){
        int[] digits = new int[10]; // from 0 to 9
        int counter = 0;
        while (num > 0){
            digits[num % 10]++;
            num /= 10;
        }
        for (int i = 0; i < digits.length; i++){
            if (digits[i] != 0){
                counter++;
            }
        }
        return counter;
    }
}
