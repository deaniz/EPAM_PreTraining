package com.company;

public class MoodSensor{
    public static String identifyMood (){
        int num = (int) (Math.random () * (6 - 1)) + 1; // generates a random integer number from [1 ; 6)
        switch (num){ // no need to use break operator, when return statement is used
            case 1:
                return (" :-C --> (disappointed, devastated)");
            case 2:
                return (" :-( --> (sad)");
            case 3:
                return (" :-| --> (neutral, indifferent)");
            case 4:
                return (" :-) --> (contented)");
            case 5:
                return (" :-D --> (overjoyed, happy)");
            default:
                return ("Current mood cannot be identified");
        }
    }
}
