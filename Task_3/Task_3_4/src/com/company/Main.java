package com.company;

public class Main{
    public static void main (String[] args){
        String currentMood = MoodSensor.identifyMood ();

        System.out.println ("Current mood " + currentMood);
    }
}