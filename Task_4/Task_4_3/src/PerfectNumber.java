public class PerfectNumber{
    public static boolean isPerfectNumber (int num){
        int sum = 1;
        for (int i = 2; i <= num / 2; i++){
            if (num % i == 0){
                sum += i;
            }
        }
        return sum == num;
    }
}
