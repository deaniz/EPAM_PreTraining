package com.company;

public class VowelCheck{
    /*
    // *** First method ***

    public static boolean isVowel (char letter){
        char[] setOfVowels = new char[] {'a', 'e', 'i', 'o', 'u', 'y'};
        letter = Character.toLowerCase (letter);
        for (int i = 0; i < setOfVowels.length; i++) {
            if (setOfVowels[i] == letter) {
                return true;
            }
        }
        return false;
    }
    */


    /*
    // *** Second method ***
    public static boolean isVowel (char letter){
        letter = Character.toLowerCase (letter);
        switch (letter) {
            case 'a':
            case 'u':
            case 'o':
            case 'e':
            case 'i':
            case 'y':
                return true;
        }
        return false;
    }
    */


    // *** Third method ***
    public static boolean isVowel (char letter){
        letter = Character.toLowerCase (letter);
        if (letter == 'u' || letter == 'a' || letter == 'o' || letter == 'i' || letter == 'e' || letter == 'y') {
            return true;
        }
        return false;
    }


    /*
    // *** Fourth method ***
    public static boolean isVowel (char letter){
        return "aeiouy".contains ((letter + "").toLowerCase ());
    }
    */


    /*
    // *** Fifth method ***
    public static boolean isVowel (char letter){
        letter = Character.toLowerCase (letter);
        if ((letter + "").toLowerCase ().matches ("[aeiouy]")){
            return true;
        }
        return false;
    }
    */
}