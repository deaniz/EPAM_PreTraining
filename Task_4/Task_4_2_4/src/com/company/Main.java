package com.company;

import java.util.ArrayList;

public class Main{
    public static void main (String[] args){
        int num = 27;

        ArrayList <Integer> arrOfPrimeDivisors = PrimeDivisors.findPrimeDivisors (num);

        System.out.print ("Prime divisors of the given number: ");
        for (int i : arrOfPrimeDivisors){
            System.out.print (i + " ");
        }
    }
}