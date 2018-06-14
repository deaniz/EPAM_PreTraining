package by.epam.preTraining.DenisChubrick.task_7.businessLogic;

import by.epam.preTraining.DenisChubrick.task_7.entities.Plane;

public class TotalCost{
    public static int countTotalCost (Plane[] planes){
        if (planes == null){
            return 0;
        }
        int totalCost = 0;
        for (int i = 0; i < planes.length; i++){
            if (planes[i] != null){
                totalCost += planes[i].getCost ();
            }
        }
        return totalCost;
    }
}