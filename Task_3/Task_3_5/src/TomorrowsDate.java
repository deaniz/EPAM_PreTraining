public class TomorrowsDate{
    public static boolean isBisSextile (int year){
        if (year % 4 != 0){ // 2012, 1600, 1800 pass
            return false;
        }
        else if (year % 100 == 0 && year % 400 != 0){ // exclude 1800
            return false;
        }
        return true;
    }

    public static int[] identifyDate (int[] date){ // day, month, year
        if (date[1] == 1 || date[1] == 3 || date[1] == 5 || date[1] == 7 || date[1] == 8 || date[1] == 10){ // 31-day months
            if (date[0] != 31){
                date[0]++; // day
                return date;
            }
            date[0] = 1; // day
            date[1]++; // month
            return date;
        }
        else if (date[1] == 4 || date[1] == 6 || date[1] == 9 || date[1] == 11){ // 30-day months
            if (date[0] != 30){
                date[0]++; // day
                return date;
            }
            date[0] = 1; // day
            date[1]++; // month
            return date;
        }
        else if (date[1] == 12){ // December
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
            if (isBisSextile (date[2])){
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
}