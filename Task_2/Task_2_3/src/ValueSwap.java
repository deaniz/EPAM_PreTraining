public class ValueSwap{
    public static void swapValue (int a, int b){
        a = a + b; // a = a ^ b;
        b = a - b; // b = a ^ b;
        a = a - b; // a = a ^ b;
        System.out.println ("After the swap: a = " + a + ", b = " + b);
    }
}
