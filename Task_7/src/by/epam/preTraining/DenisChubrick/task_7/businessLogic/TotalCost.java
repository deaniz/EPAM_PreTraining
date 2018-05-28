package by.epam.preTraining.DenisChubrick.task_7.businessLogic;

import by.epam.preTraining.DenisChubrick.task_7.entities.Plane;

public class TotalCost{
    public static int countTotalCost (Plane[] planes){
        int totalCost = 0;
        for (int i = 0; i < planes.length; i++){
            totalCost += planes[i].getCost ();
        }
        return totalCost;
    }
}
