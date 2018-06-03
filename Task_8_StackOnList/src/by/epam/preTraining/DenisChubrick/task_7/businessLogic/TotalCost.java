package by.epam.preTraining.DenisChubrick.task_7.businessLogic;

import by.epam.preTraining.DenisChubrick.task_7.entities.Plane;

public class TotalCost{
    public static int countTotalCost (Plane head){
        if (head == null){
            return 0;
        }
        int totalCost = 0;
        Plane tmp = head;
        for (; ; ){
            if (tmp.getPrev () != null){
                totalCost += tmp.getCost ();
                tmp = tmp.getPrev ();
            }
            else{
                totalCost += tmp.getCost ();
                break;
            }
        }
        return totalCost;
    }
}