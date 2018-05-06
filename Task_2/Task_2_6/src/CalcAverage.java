public class CalcAverage{
    public static int[] retrieveDigits (int num){
        int tmpNum = num;
        int remainder;
        int divisor = 10;
        int[] array = new int[6]; // for six-digit number
        remainder = tmpNum % divisor;
        tmpNum -= remainder;
        array[5] = remainder;
        divisor *= 10;
        remainder = tmpNum % divisor;
        tmpNum -= remainder;
        remainder /= 10;
        array[4] = remainder;
        divisor *= 10;
        remainder = tmpNum % divisor;
        tmpNum -= remainder;
        remainder /= 100;
        array[3] = remainder;
        divisor *= 10;
        remainder = tmpNum % divisor;
        remainder /= 1_000;
        array[2] = remainder;
        divisor *= 10;
        remainder = tmpNum % divisor;
        remainder /= 10_000;
        array[1] = remainder;
        divisor *= 10;
        remainder = tmpNum % divisor;
        remainder /= 100_000;
        array[0] = remainder;
        return array;
    }

    public static double calcArithmetic (int[] array){
        return (array[0] + array[1] + array[2] + array[3] + array[4] + array[5]) / array.length;
    }

    public static double calcGeometric (int[] array){
        int mult = array[0] * array[1] * array[2] * array[3] * array[4] * array[5];
        return Math.pow (mult, 1.0 / array.length);
    }
}
