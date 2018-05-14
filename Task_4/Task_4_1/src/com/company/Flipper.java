package com.company;

import java.util.Random;

public class Flipper{
    public static final int numberOfOptions = 2;

    public static int flipCoin (int numberOfFlips){
        int currentFlip = 0;
        int heads = 0; // no need to initialize variable 'tails' because there are only two possible options
        while (currentFlip < numberOfFlips){
            Random ran = new Random ();
            int rnd = ran.nextInt (numberOfOptions);
            if (rnd == 0){
                heads++;
            }
            currentFlip++;
        }
        return heads;
    }
}