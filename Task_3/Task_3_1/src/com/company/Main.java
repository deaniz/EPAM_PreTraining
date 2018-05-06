package com.company;

public class Main{
    public static void main (String[] args){
        Coordinates a = new Coordinates (2, 2);
        Coordinates b = new Coordinates (-1, 2);
        Coordinates c = new Coordinates (-1, -3);

        System.out.println ("*** Task_3_1 - Three points (triangle) ***");
        boolean isTriangle = TriangleCheck.canBeTriangle (a, b, c);
        if (isTriangle){
            System.out.println ("Can be a triangle");
            boolean isRightAngled = TriangleCheck.rightAngled (a, b, c);
            if (isRightAngled) {
                System.out.println ("Can be a right angled triangle");
            }
            else {
                System.out.println ("Cannot be right angled");
            }
        }
        else {
            System.out.println ("Cannot be a triangle");
        }
    }
}