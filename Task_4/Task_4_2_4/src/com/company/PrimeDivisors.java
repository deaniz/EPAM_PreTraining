package com.company;

public class PrimeDivisors{
    public static void printPrimeDivisors (int num){ // finds all the prime divisors except the number itself
        System.out.print ("Prime divisors: ");
        boolean primeDivisor = false;
        for (int i = 3; i < num; i += 2){
            if (num % i == 0){
                if (isPrime (i)){
                    System.out.print (i + " ");
                    primeDivisor = true;
                }
            }
        }
        if (!primeDivisor){
            System.out.print ("there are no prime divisors");
        }
    }

    public static boolean isPrime (int divisor){
        for (int i = 3; i * i <= divisor; i += 2){
            if (divisor % i == 0){
                return false;
            }
        }
        return true;
    }
}