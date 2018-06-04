package by.epam.preTraining.DenisChubrick.task_7.businessLogic;

import by.epam.preTraining.DenisChubrick.task_7.entities.Plane;

public class Sorter{
    // bubble sort by cost
    public static Plane[] useBubbleSort (Plane[] array){
        int passes = array.length - 1;
        for (int i = 0; i < array.length; i++, passes--){
            for (int j = 0; j < passes; j++){
                if (array[j] != null && array[j + 1] != null && array[j].getCost () < array[j + 1].getCost ()){
                    Plane tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }


    // insertion sort by max speed
    public static Plane[] useInsertionSort(Plane[] array){
        for(int i = 1; i < array.length; i++){
            for(int j = i; j > 0 && array[j - 1].getMaxSpeed () > array[j].getMaxSpeed (); j--) {
                Plane tmp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = tmp;
            }
        }
        return array;
    }


    // selection sort by cost
    public static Plane[] useSelectionSort(Plane[] array){
        for (int min = 0; min < array.length - 1; min++){
            int least = min;
            for (int j = min + 1; j < array.length; j++){
                if (array[least].getCost () > array[j].getCost ()){
                    least = j;
                }
            }
            Plane tmp = array[min];
            array[min] = array[least];
            array[least] = tmp;
        }
        return array;
    }


    // binary sort by name
    public static Plane[] useBinarySort (Plane[] array, int left, int right){
        int i = left;
        int j = right;
        String tmpStr = array[(i + j) / 2].getName ();
        while (i <= j){
            while (array[i].getName ().compareTo (tmpStr) < 0){
                i++;
            }
            while (array[j].getName ().compareTo (tmpStr) > 0){
                j--;
            }
            if (i <= j){ //swap elements
                Plane tmpStud = array[i];
                array[i] = array[j];
                array[j] = tmpStud;
                i++;
                j--;
            }
        }
        if (left < j){ //recursive call
            useBinarySort (array, left, j);
        }
        if (i < right){
            useBinarySort (array, i, right);
        }
        return array;
    }
}
