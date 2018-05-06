public class Main{
    public static void main (String[] args){
        // *** 6 - arithmetic and geometric averages ***
        int num = 123456;

        int[] array = CalcAverage.retrieveDigits (num);
        double arithmAverage = CalcAverage.calcArithmetic (array);
        double geomAverage = CalcAverage.calcGeometric (array);

        System.out.println ("\n*** 6 - Arithmetic and geometric averages ***\n");
        System.out.printf ("Arithmetic average: %.3f\n", arithmAverage);
        System.out.printf ("Geometric average: %.3f", geomAverage);
    }
}
