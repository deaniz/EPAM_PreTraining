package com.company;

import java.util.Random;

public class Main{
    public static void main (String[] args){
        double leftBound = -19.93;
        double rightBound = 10.9;
        double[][] matrix = new double[3][5];

        initialize (matrix, leftBound, rightBound);
        double[][] trMatrix = MatrixTransposition.transposeMatrix (matrix);

        for (int i = 0; i < trMatrix.length; i++){
            for (int j = 0; j < trMatrix[i].length; j++){
                System.out.print (trMatrix[i][j] + "\t");
            }
            System.out.println ();
        }
    }


    private static void initialize (double[][] matrix, double leftBound, double rightBound){ // [leftBound; rightBound)
        Random ran = new Random ();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = ran.nextDouble () * (rightBound - leftBound) + leftBound;
            }
        }
    }
}
