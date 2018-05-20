import java.util.Random;

public class Main{
    public static void main (String[] args){
        double leftBound = -19.93;
        double rightBound = 10.9;
        double[][] matrix = new double[5][5];

        initialize (matrix, leftBound, rightBound);
        boolean isSymmetrical = SymmetricSecondaryDiagonal.isSymmetrical (matrix);

        System.out.println ("The matrix is symmetrical relatively to the secondary diagonal: " + isSymmetrical);

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


// double[][] mat = {{4, 5, 3, 9}, {7, 6, 5, 3}, {8, 4, 6, 5}, {7, 8, 7, 4}}; - symmetrical relatively to the sec. diagonal