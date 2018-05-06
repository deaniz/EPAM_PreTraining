package com.company;

public class VowelCheck{
    // *** First variant ***
    /*
    static char[] setOfVowels = new char[] {'a', 'e', 'i', 'o', 'u', 'y'};

    public static boolean vowel (char[] letter) {
        for (int i = 0; i < setOfVowels.length; i++) {
            if (setOfVowels[i] == letter[0]) {
                return true;
            }
        }
        return false;
    }
    */


    // *** Second variant ***
    public static boolean vowel (char[] letter){
        return -1 != "aeiouy".indexOf (letter[0]);
    }
}