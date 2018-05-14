package com.company;

public class Main{
    public static void main (String[] args){
        int numberOfFlips = 1000;

        int heads = Flipper.flipCoin (numberOfFlips);
        int tails = numberOfFlips - heads;

        System.out.println ("Heads: " + heads + ", tails: " + tails);
    }
}