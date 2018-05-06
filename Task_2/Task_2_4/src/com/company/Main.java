package com.company;

public class Main{
    public static void main (String[] args){
        // *** 4 - Order of digits ***
        int num = 1379; // ascending order

        int[] array = OrderTester.retrieveDigits (num);
        System.out.println ("*** 4 - Order of digits ***");
        if (OrderTester.isAscending (array)){
            System.out.println ("Number " + num + " has ascending order of digits");
        }
        else if (OrderTester.isDescending (array)){
            System.out.println ("Number " + num + " has descending order of digits");
        }
        else{
            System.out.println ("Number " + num + " has no specific order of digits");
        }
    }
}