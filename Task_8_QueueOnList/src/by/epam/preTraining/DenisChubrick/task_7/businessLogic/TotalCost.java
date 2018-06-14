package by.epam.preTraining.DenisChubrick.task_7.businessLogic;

import by.epam.preTraining.DenisChubrick.task_7.entities.Plane;

public class TotalCost{
    public static int countTotalCost (Plane head){
        if (head == null){
            return 0;
        }
        int totalCost = 0;
        Plane tmp = head;
        while (true){
            if (tmp.getNext () != null){
                totalCost += tmp.getCost ();
                tmp = tmp.getNext ();
            }
            else{
                totalCost += tmp.getCost ();
                break;
            }
        }
        return totalCost;
    }
}