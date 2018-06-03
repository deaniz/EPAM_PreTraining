package by.epam.preTraining.DenisChubrick.task_7.businessLogic;

import by.epam.preTraining.DenisChubrick.task_7.entities.Plane;

public class MostExpensivePlane{
    public static Plane findMostExpensive (Plane[] stack, int top){
        if (top == -1 && stack == null){
            return null;
        }
        Plane mostExpensive = stack[0];
        for (int i = 1; i <= top; i++){
            if (stack[i].getCost () > mostExpensive.getCost ()){
                mostExpensive = stack[i];
            }
        }
        return mostExpensive;
    }
}
