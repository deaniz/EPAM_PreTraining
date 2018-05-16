package com.company;

public class GCD_LCM{
    public static int countGCD (int a, int b){
        if (a % b == 0){
            return b;
        }
        if (b % a == 0){
            return a;
        }
        while (a > 0 && b > 0){
            if (a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        return a;
    }

    public static int countLCM (int a, int b, int gcd){
        return (a / gcd) * b;
    }
}
