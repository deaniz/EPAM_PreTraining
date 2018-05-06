package com.company;

public class TriangleCheck{
    public static boolean canBeTriangle (Coordinates a, Coordinates b, Coordinates c){
        if (a.x == b.x){
            if (a.x == c.x) {
                return false;
            }
            return true;
        }
        else if (a.y == b.y) {
            if (a.y == c.y) {
                return false;
            }
            return true;
        }
        return true;
    }
    public static boolean rightAngled (Coordinates a, Coordinates b, Coordinates c){
        if (a.x == b.x || a.y == b.y){
            if (a.x == c.x || a.y == c.y){
                return true;
            }
            else if (b.x == c.x || b.y == c.y) {
                return true;
            }
        }
        else if (a.y == c.y && b.x == c.x) {
            return true;
        }
        else if (a.x == c.x && b.y == c.y) {
            return true;
        }
        return false;
    }
}