package com.company;

public class CalcSumMult{

    public static int[] retrieveDigits (int num){
        int tmpNum = num;
        int remainder;
        int divisor = 10;
        int[] array = new int[5]; // for five-digit number
        remainder = tmpNum % divisor;
        tmpNum -= remainder;
        array[4] = remainder;
        divisor *= 10;
        remainder = tmpNum % divisor;
        tmpNum -= remainder;
        remainder /= 10;
        array[3] = remainder;
        divisor *= 10;
        remainder = tmpNum % divisor;
        tmpNum -= remainder;
        remainder /= 100;
        array[2] = remainder;
        divisor *= 10;
        remainder = tmpNum % divisor;
        remainder /= 1_000;
        array[1] = remainder;
        divisor *= 10;
        remainder = tmpNum % divisor;
        remainder /= 10_000;
        array[0] = remainder;
        return array;
    }

    public static int calcSum (int[] array){
        return array[0] + array[1] + array[2] + array[3] + array[4];
    }

    public static int calcMult (int[] array){
        return array[0] * array[1] * array[2] * array[3] * array[4];
    }
}
