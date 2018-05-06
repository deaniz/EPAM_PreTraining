package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main (String[] args){
        char[] letter = new char[] {};

        System.out.print ("Enter a lower-case character: ");
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        try{
            letter = br.readLine ().toCharArray ();
        } catch (IOException exc){
            System.out.println ("IOException");
        }
        boolean isVowel = VowelCheck.vowel (letter);

        System.out.println ("The character '" + letter[0] + (isVowel ? "' is a vowel" : "' is not a vowel"));

    }
}