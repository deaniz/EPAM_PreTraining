public class Main{
    public static void main (String[] args){
        int[] date = {28, 2, 2018}; // date: day, month, year
        int[] tomorrowsDate;

        tomorrowsDate = TomorrowsDate.identifyDate (date);

        System.out.print ("Tomorrow's date: ");
        for (int i : tomorrowsDate){
            System.out.print (i + ".");
        }
    }
}