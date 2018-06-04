package by.epam.preTraining.DenisChubrick.task_7.businessLogic;

import by.epam.preTraining.DenisChubrick.task_7.entities.Plane;

public class Searcher{
    // linear search
    public static Plane useLinearSearch (Plane[] array){
        if (array == null){
            return null;
        }
        Plane mostExpensive = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] != null){
                if (array[i].getCost () > mostExpensive.getCost ()){
                    mostExpensive = array[i];
                }
            }
        }
        return mostExpensive;
    }


    //binary search
    public static int useBinarySearch (Plane[] array, int value){
        int left = 0;
        int right = array.length;
        int middle;
        while (left < right){
            middle = (left + right) / 2;
            if (value == array[middle].getCost ()){
                return middle;
            }
            else{
                if (value < array[middle].getCost ()){
                    right = middle;
                }
                else{
                    left = middle + 1;
                }
            }
        }
        return -1;
    }
}
