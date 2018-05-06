public class CountHeads{
    public static final int youngAge = 200;
    public static final int middleAge = 300;
    public static final int youngHeads = 3;
    public static final int middleHeads = 2;
    public static final int oldHeads = 1;

    public static int countHeads (int age, int initHeads) {
        if (age <= youngAge) {
            return initHeads + age * youngHeads;
        }
        else if (age <= middleAge) {
            return initHeads + youngAge * youngHeads + (age - youngAge) * middleHeads;
        }
        return initHeads + youngAge * youngHeads + (middleAge - youngAge) * middleHeads + (age - middleAge) * oldHeads;
    }
}
