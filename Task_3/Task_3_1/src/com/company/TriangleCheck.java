package com.company;

public class TriangleCheck{
    public static boolean canBeTriangle (int x1, int y1, int x2, int y2, int x3, int y3){
        if (x1 == x2){
            if (x1 == x3) {
                return false;
            }
            return true;
        }
        else if (y1 == y2) {
            if (y1 == y3) {
                return false;
            }
            return true;
        }
        return true;
    }
    public static boolean rightAngled (int x1, int y1, int x2, int y2, int x3, int y3){
        if (x1 == x2 || y1 == y2){
            if (x1 == x3 || y1 == y3){
                return true;
            }
            else if (x2 == x3 || y2 == y3) {
                return true;
            }
            return false;
        }
        else if (y1 == y3 && x2 == x3) {
            return true;
        }
        else if (x1 == x3 && y2 == y3) {
            return true;
        }
        return false;
    }
}