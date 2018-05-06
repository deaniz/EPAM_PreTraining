public class ReverseOrder{
    public static int[] retrieveDigits (int num){
        int tmpNum = num;
        int remainder;
        int divisor = 10;
        int[] array = new int[7]; // for seven-digit number
        remainder = tmpNum % divisor;
        tmpNum -= remainder;
        array[0] = remainder;
        divisor *= 10;
        remainder = tmpNum % divisor;
        tmpNum -= remainder;
        remainder /= 10;
        array[1] = remainder;
        divisor *= 10;
        remainder = tmpNum % divisor;
        tmpNum -= remainder;
        remainder /= 100;
        array[2] = remainder;
        divisor *= 10;
        remainder = tmpNum % divisor;
        remainder /= 1_000;
        array[3] = remainder;
        divisor *= 10;
        remainder = tmpNum % divisor;
        remainder /= 10_000;
        array[4] = remainder;
        divisor *= 10;
        remainder = tmpNum % divisor;
        remainder /= 100_000;
        array[5] = remainder;
        divisor *= 10;
        remainder = tmpNum % divisor;
        remainder /= 1_000_000;
        array[6] = remainder;
        return array;
    }
}
