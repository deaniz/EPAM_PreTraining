package com.company;

public class Main{
    public static void main (String[] args){
        double[] array = {144.2, 7.98, 12.0, 1.113, -34.65, 119.2};

        int minimumPosition = LocMinimum.findLocMinimum (array);

        System.out.print ("The position of the local minimum: ");
        System.out.println (minimumPosition > 0 ? minimumPosition : "There is no local minimum in the array");
    }
}
