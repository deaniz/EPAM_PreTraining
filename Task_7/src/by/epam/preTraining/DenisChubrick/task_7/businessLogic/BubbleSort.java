package by.epam.preTraining.DenisChubrick.task_7.businessLogic;

import by.epam.preTraining.DenisChubrick.task_7.entities.Plane;

public class BubbleSort{
    public static Plane[] sortByCost (Plane[] array){
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
}
