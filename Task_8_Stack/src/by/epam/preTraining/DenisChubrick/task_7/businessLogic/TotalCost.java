package by.epam.preTraining.DenisChubrick.task_7.businessLogic;

import by.epam.preTraining.DenisChubrick.task_7.entities.Plane;

public class TotalCost{
    public static int countTotalCost (Plane head){
        int totalCost = 0;
        Plane tmp = head;
        for (; ; ){
            totalCost += tmp.getCost ();
            if (tmp.getPrev () != null){
                tmp = tmp.getPrev ();
            }
            else{
                break;
            }
        }
        return totalCost;
    }
}
