public class TomorrowsDate{
    public static final int january = 1;
    //public static final int february = 2;
    public static final int march = 3;
    public static final int april = 4;
    public static final int may = 5;
    public static final int june = 6;
    public static final int july = 7;
    public static final int august = 8;
    public static final int september = 9;
    public static final int october = 10;
    public static final int november = 11;
    public static final int december = 12;

    public static int[] identifyDate (int[] date){
        if (date[1] == january || date[1] == march || date[1] == may || date[1] == july || date[1] == august || date[1] == october){ // 31-day months
            if (date[0] != 31){
                date[0]++; // day
                return date;
            }
            date[0] = 1; // day
            date[1]++; // month
            return date;
        }
        else if (date[1] == april || date[1] == june || date[1] == september || date[1] == november){ // 30-day months
            if (date[0] != 30){
                date[0]++; // day
                return date;
            }
            date[0] = 1; // day
            date[1]++; // month
            return date;
        }
        else if (date[1] == december){ // December
            if (date[0] != 31){
                date[0]++; // day
                return date;
            }
            date[0] = 1; // day
            date[1] = 1; // month
            date[2]++; // year
            return date;
        }
        else{ // February
            if (isLeapYear (date[2])){
                if (date[0] != 29){
                    date[0]++; // day
                    return date;
                }
                date[0] = 1; // day
                date[1]++; // month
                return date;
            }
            if (date[0] != 28){
                date[0]++; // day
                return date;
            }
            date[0] = 1; // day
            date[1]++; // month
            return date;
        }
    }

    public static boolean isLeapYear (int year){
        if (year % 4 != 0){
            return false;
        }
        else if (year % 100 == 0 && year % 400 != 0){
            return false;
        }
        return true;
    }
}