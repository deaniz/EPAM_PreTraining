package com.company;

public class MoodSensor{
    public static final String disappointed = ":-C --> (disappointed, devastated)";
    public static final String sad = ":-( --> (sad)";
    public static final String neutral = ":-| --> (neutral, indifferent)";
    public static final String contented = ":-) --> (contented)";
    public static final String happy = ":-D --> (overjoyed, happy)";
    public static final int moodTypes = 5;

    public static String identifyMood (){
        int num = (int) (Math.random () * (moodTypes)) + 1; // generates a random integer number from [1 ; 5]
        switch (num){
            case 1:
                return disappointed;
            case 2:
                return sad;
            case 3:
                return neutral;
            case 4:
                return contented;
            case 5:
                return happy;
        }
        return "Current mood cannot be identified";
    }
}
