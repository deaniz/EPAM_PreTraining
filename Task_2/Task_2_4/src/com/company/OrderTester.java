package com.company;

public class OrderTester{
    public static int[] retrieveDigits (int num){
        int tmpNum = num;
        int remainder;
        int divisor = 10;
        int[] array = new int[4]; // for four-digit number
        remainder = tmpNum % divisor;
        tmpNum -= remainder;
        array[3] = remainder;
        divisor *= 10;
        remainder = tmpNum % divisor;
        tmpNum -= remainder;
        remainder /= 10;
        array[2] = remainder;
        divisor *= 10;
        remainder = tmpNum % divisor;
        tmpNum -= remainder;
        remainder /= 100;
        array[1] = remainder;
        divisor *= 10;
        remainder = tmpNum % divisor;
        remainder /= 1000;
        array[0] = remainder;
        return array;
    }

    public static boolean isAscending (int[] array){
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] > array[i + 1]){
                return false;
            }
        }
        return true;
    }

    public static boolean isDescending (int[] array){
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] < array[i + 1]){
                return false;
            }
        }
        return true;
    }
}