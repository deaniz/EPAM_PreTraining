package com.company;

public class Main{
    public static void main (String[] args){
        // Area of a ring
        double r1 = 9.1;
        double r2 = 3.9;

        double s = RingArea.calcRingArea (r1, r2); // area of the ring

        System.out.println ("\n*** 2 - Area of the ring ***");
        System.out.printf ("Area of the ring s = %.3f\n", s);
    }
}
