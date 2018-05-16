package com.company;

public class Main{
    public static void main (String[] args){
        int a = 30;
        int b = 12;

        int gcd = GCD_LCM.countGCD (a, b);
        int lcm = GCD_LCM.countLCM (a, b, gcd);

        System.out.println ("GCD: " + gcd + "; LCM: " + lcm);
    }
}
