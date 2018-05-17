package com.company;

public class OrderTester {
    public static boolean hasAscendingOrder(double[] array){
        for (int i = 0; i < array.length - 1; i++){
            if (array[i + 1] < array[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean hasDescendingOrder(double[] array){
        for (int i = 0; i < array.length - 1; i++){
            if (array[i + 1] > array[i]){
                return false;
            }
        }
        return true;
    }
}
