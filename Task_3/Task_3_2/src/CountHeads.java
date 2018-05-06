public class CountHeads{
    public static final int youngAge = 200;
    public static final int midAge = 300;
    public static final int youngHeads = 3;
    public static final int midHeads = 2;
    public static final int oldHeads = 1;

    public static int countHeads (int age, int initHeads){
        if (age < 0){
            return 0;
        }
        else if (age <= youngAge){
            return initHeads + age * youngHeads;
        }
        else if (age <= midAge){
            return initHeads + youngAge * youngHeads + (age - youngAge) * midHeads;
        }
        return initHeads + youngAge * youngHeads + (midAge - youngAge) * midHeads + (age - midAge) * oldHeads;
    }
}
