package com.company;

public class PrimeNumberChecker{
    public static boolean isPrime (int num){
        if (num <= 0){
            return false;
        }
        else if (num == 1){
            return false;
        }
        else if (num == 2){
            return true;
        }
        else if (num % 2 == 0){
            return false;
        }
        else{
            for (int i = 3; i * i <= num; i += 2){
                if (num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}