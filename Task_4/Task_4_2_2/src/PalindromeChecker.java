public class PalindromeChecker{

    public static boolean isPalindrome (int num){
        int counter = 0;
        int tmpNum = num;
        int tmpN = num;
        while (tmpN > 0){
            tmpN /= 10;
            counter++;
        }
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