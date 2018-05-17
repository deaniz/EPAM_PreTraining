package com.company;

public class Main {
    public static void main(String[] args) {
        double[] array = {-34.65, 4.2, 76.98, 119.2};

        boolean hasAscendingOrder = OrderTester.hasAscendingOrder(array);
        boolean hasDescendingOrder;

        if (hasAscendingOrder){
            hasDescendingOrder = false;
        }
        else {
            hasDescendingOrder = OrderTester.hasDescendingOrder(array);
        }

        System.out.println("The array has ascending order: " + hasAscendingOrder);
        System.out.println("The array has descending order: " + hasDescendingOrder);
    }
}
