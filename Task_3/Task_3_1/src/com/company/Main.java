package com.company;

public class Main{
    public static void main (String[] args){
        int x1 = 2;
        int y1 = 2;
        int x2 = -1;
        int y2 = 2;
        int x3 = -1;
        int y3 = -3;

        System.out.println ("*** Task_3_1 - Three points (triangle) ***");
        boolean isTriangle = TriangleCheck.canBeTriangle (x1, y1, x2, y2, x3, y3);
        if (isTriangle){
            System.out.println ("Can be a triangle");
            boolean isRightAngled = TriangleCheck.rightAngled (x1, y1, x2, y2, x3, y3);
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