public class Main{
    public static void main (String[] args){
        int initHeads = 3; // initial amount of heads
        int age = 654;

        int currentHeads = CountHeads.countHeads (age, initHeads);
        int currentEyes = currentHeads * 2;

        System.out.println ("*** Task_3_2 - Heads and eyes of a dragon ***");
        System.out.println ("Current age: " + age);
        System.out.println ("Current amount of heads: " + currentHeads + "\nCurrent amount of eyes: " + currentEyes);
    }
}
