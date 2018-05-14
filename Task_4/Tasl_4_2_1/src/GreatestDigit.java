public class GreatestDigit{
    public static int findGreatestDigit (int num){
        num = num > 0 ? num : -num; // getting rid of a negative number
        int greatestDigit = 0;
        while (num > 0){
            greatestDigit = num % 10 > greatestDigit ? num % 10 : greatestDigit;
            num /= 10;
        }
        return greatestDigit;
    }
}
