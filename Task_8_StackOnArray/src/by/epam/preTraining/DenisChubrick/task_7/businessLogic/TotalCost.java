package by.epam.preTraining.DenisChubrick.task_7.businessLogic;

import by.epam.preTraining.DenisChubrick.task_7.entities.Plane;

public class TotalCost{
    public static int countTotalCost (Plane[] stack, int top){
        if (top == -1 && stack == null){
            return 0;
        }
        int totalCost = 0;
        for (int i = 0; i <= top; i++){
            totalCost += stack[i].getCost ();
        }
        return totalCost;
    }
}