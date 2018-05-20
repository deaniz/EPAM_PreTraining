public class SymmetricSecondaryDiagonal{
    public static boolean isSymmetrical (double[][] matrix){
        if (matrix.length != matrix[0].length){ // only square matrices can be symmetrical
            return false;
        }
        int difference;
        int columnAmount = matrix.length - 1;
        for (int i = 0; i < matrix.length - 1; i++, columnAmount--){
            difference = columnAmount;
            for (int j = 0; j < columnAmount; j++, difference--){
                if (matrix[i][j] != matrix[i + difference][j + difference]){
                    return false;
                }
            }
        }
        return true;
    }
}
