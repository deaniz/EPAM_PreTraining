public class ArithmeticGeometricAverage{
    public static double calcArithmAv (double[][] matrix){
        int elemAmount = 0;
        double sum = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                sum += matrix[i][j];
                elemAmount++;
            }
        }
        return sum / (matrix.length * elemAmount);
    }


    public static double calcGeomAv (double[][] matrix){
        int elemAmount = 0;
        double mult = 1;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                mult *= matrix[i][j];
                elemAmount++;
            }
        }
        mult = mult > 0 ? mult : -mult;
        return Math.pow (mult, 1.0 / elemAmount);
    }
}
