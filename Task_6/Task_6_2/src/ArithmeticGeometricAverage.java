public class ArithmeticGeometricAverage{
    public static double calcArithmAv (double[][] array){
        int elemAmount = 0;
        double sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                sum += array[i][j];
                elemAmount++;
            }
        }
        return sum / (array.length * elemAmount);
    }


    public static double calcGeomAv (double[][] array){
        int elemAmount = 0;
        double mult = 1;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                mult *= array[i][j];
                elemAmount++;
            }
        }
        mult = mult > 0 ? mult : -mult;
        return Math.pow (mult, 1.0 / elemAmount);
    }
}
