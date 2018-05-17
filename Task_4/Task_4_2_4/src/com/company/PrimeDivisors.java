package com.company;

import java.util.ArrayList;

public class PrimeDivisors{

    public static ArrayList <Integer> findPrimeDivisors (int num){ // finds all the prime divisors except the number itself
        ArrayList <Integer> arrOfPrimeDivisors = new ArrayList <> ();
        if (num % 2 == 0 && num != 2){
            arrOfPrimeDivisors.add (2);
        }
        for (int i = 3; i <= num / 2; i += 2){
            if (num % i == 0){
                if (isPrime (i)){
                    arrOfPrimeDivisors.add (i);
                }
            }
        }
        return arrOfPrimeDivisors;
    }


    private static boolean isPrime (int divisor){
        for (int i = 3; i * i <= divisor; i += 2){
            if (divisor % i == 0){
                return false;
            }
        }
        return true;
    }
}