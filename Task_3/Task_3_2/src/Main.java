public class Main{
    public static final int eyesPerHead = 2;

    public static void main (String[] args){
        int initHeads = 3; // initial amount of heads
        int age = 654;

        int currentHeads = CountHeads.countHeads (age, initHeads);
        int currentEyes = currentHeads * eyesPerHead;

        System.out.println ("*** Task_3_2 - Heads and eyes of a dragon ***");
        System.out.println ("Current amount of heads: " + currentHeads + "\nCurrent amount of eyes: " + currentEyes);
    }
}
