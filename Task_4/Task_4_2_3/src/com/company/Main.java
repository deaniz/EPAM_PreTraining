package com.company;

public class Main{
    public static void main (String[] args){
        int num = 31;

        boolean isPrime = PrimeNumberChecker.isPrime (num);

        System.out.println ("The number is prime: " + isPrime);
    }
}
