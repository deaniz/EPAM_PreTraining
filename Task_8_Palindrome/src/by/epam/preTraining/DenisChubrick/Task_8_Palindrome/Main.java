package by.epam.preTraining.DenisChubrick.Task_8_Palindrome;


public class Main{
    public static void main (String[] args){
        String str = "rotator";
        Container container = new Container ();
        boolean isPalindrome = container.isPalindrome (str);
        System.out.println (isPalindrome);
    }
}
