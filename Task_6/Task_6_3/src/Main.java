import java.util.Random;

public class Main{
    public static void main (String[] args){
        double leftBound = -19.93;
        double rightBound = 10.9;
        double[][] matrix = new double[3][5];

        initialize (matrix, leftBound, rightBound);
        int[] minimumPosition = LocMinimum.findLocMinimum (matrix);

        System.out.print ("The position of the first local minimum: " + minimumPosition[0] + "; " + minimumPosition[1]);
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
