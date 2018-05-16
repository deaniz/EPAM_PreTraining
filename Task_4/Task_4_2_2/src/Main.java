public class Main{
    public static void main (String[] args){
        int num = 113311;

        int digitsAmount = PalindromeChecker.countAmountOfDigits (num);
        boolean isPalindrome = PalindromeChecker.isPalindrome (num, digitsAmount);

        System.out.println ("Can be palindrome: " + isPalindrome);
    }
}