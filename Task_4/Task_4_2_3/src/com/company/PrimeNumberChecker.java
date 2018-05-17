package com.company;

public class PrimeNumberChecker{
    public static boolean isPrime (int num){
        if (num <= 0 || num == 1 || num % 2 == 0 & num != 2){
            return false;
        }
        for (int i = 3; i * i <= num; i += 2){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}