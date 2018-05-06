public class Main{
    public static void main (String[] args){
        int[] date = new int[] {30, 6, 2018}; // current date: day, month, year
        int[] tomorrowsDate;

        tomorrowsDate = TomorrowsDate.identifyDate (date);

        System.out.print ("Tomorrow's date: ");
        for (int i : tomorrowsDate){
            System.out.print (i + ".");
        }
    }
}
