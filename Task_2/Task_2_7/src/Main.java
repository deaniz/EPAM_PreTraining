public class Main{
    public static void main (String[] args){
        int num = 1234567;

        System.out.println ("\n*** 7 - Reverse Order Of Digits ***\n");
        int[] array = ReverseOrder.retrieveDigits (num);

        System.out.print ("The number in reverse order: ");
        System.out.print (array[0]);
        System.out.print (array[1]);
        System.out.print (array[2]);
        System.out.print (array[3]);
        System.out.print (array[4]);
        System.out.print (array[5]);
        System.out.print (array[6]);
    }
}
