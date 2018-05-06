package com.company;

public class Main{
    public static void main (String[] args){
        char letter = 'Y';

        boolean isVowel = VowelCheck.isVowel (letter);

        System.out.println ("The letter '" + letter + (isVowel ? "' is a vowel" : "' is not a vowel"));

    }
}