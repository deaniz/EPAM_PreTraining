import java.util.Random;

public class Main{
    public static void main (String[] args){
        double leftBound = -19.93;
        double rightBound = 10.9;
        double[][] array = new double[3][5];

        initialize (array, leftBound, rightBound);
        double arithmAverage = ArithmeticGeometricAverage.calcArithmAv (array);
        double geomAverage = ArithmeticGeometricAverage.calcGeomAv (array);

        System.out.printf ("Arithmetic average: %.3f\n", arithmAverage);
        System.out.printf ("Geometric average: %.3f", geomAverage);
    }


    private static void initialize (double[][] array, double leftBound, double rightBound){ // [leftBound; rightBound)
        Random ran = new Random ();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = ran.nextDouble () * (rightBound - leftBound) + leftBound;
            }
        }
    }
}
