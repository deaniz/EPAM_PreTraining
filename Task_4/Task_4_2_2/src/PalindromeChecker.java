public class PalindromeChecker{
    public static int countAmountOfDigits (int num){
        int counter = 0;
        while (num > 0){
            num /= 10;
            counter++;
        }
        return counter;
    }

    public static boolean isPalindrome (int num, int counter){
        int tmpNum = num;
        for (; counter / 2 > 0; counter--){
            if (num % 10 != (int) (tmpNum / Math.pow (10, counter - 1))){
                return false;
            }
            tmpNum %= Math.pow (10, counter - 1);
            num /= 10;
        }
        return true;
    }
}