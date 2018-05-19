public class LocMinimum{
    public static int[] findLocMinimum (double[][] array){
        int[] position = new int[2];
        for (int i = 0; i < array.length; i++){
            for (int j = 1; j < array[i].length - 1; j++){
                if (array[i][j] < array[i][j - 1] && array[i][j] < array[i][j + 1]){
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
