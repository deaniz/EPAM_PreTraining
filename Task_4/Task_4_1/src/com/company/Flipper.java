package com.company;

import java.util.Random;

public class Flipper{


    public static int flipCoin (int numberOfFlips){
        int heads = 0;
        for (int currentFlip = 0; currentFlip < numberOfFlips; currentFlip++){
            Random ran = new Random ();
            if (ran.nextBoolean ()){
                heads++;
            }
        }
        return heads;
    }
}