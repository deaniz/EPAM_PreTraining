public class LocMinimum{
    public static int[] findLocMinimum (double[][] matrix){
        int[] position = new int[2];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 1; j < matrix[i].length - 1; j++){
                if (matrix[i][j] < matrix[i][j - 1] && matrix[i][j] < matrix[i][j + 1]){
                    position[0] = i;
                    position[1] = j;
                    return position;
                }
            }
        }
        position[0] = -1;
        position[1] = -1;
        return position;
    }
}
