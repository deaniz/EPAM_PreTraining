package com.company;

public class Main{
    public static void main (String[] args){
        String currentMood = MoodSensor.identifyMood ();

        System.out.println ("Current mood " + currentMood);
    }
}

/*
int code = 0x1F600; // unicode for an emoticon U+1F600
System.out.println (Character.toChars (code)); // outputs an emoticon
*/