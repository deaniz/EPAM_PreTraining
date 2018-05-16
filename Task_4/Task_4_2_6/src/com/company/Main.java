package com.company;

public class Main{
    public static void main (String[] args){
        int num = 1993;

        int difDigitsAmount = DifferentDigits.countDifferentDigits (num);

        System.out.println ("Amount of different digits: " + difDigitsAmount);
    }
}
