package com.company;

public class Main {
    public static void main(String[] args) {
        double[] array = {4.2, 76.98, 12.0, 1.113, -34.65, 119.2};

        double arithmAverage = ArithmeticGeometricAverage.calcArithmAv(array);
        double geomAverage = ArithmeticGeometricAverage.calcGeomAv(array);

        System.out.printf("Arithmetic average: %.3f\n", arithmAverage);
        System.out.printf("Geometric average: %.3f", geomAverage);
    }
}
