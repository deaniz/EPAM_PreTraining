package by.epam.preTraining.DenisChubrick.task_7.businessLogic;

import by.epam.preTraining.DenisChubrick.task_7.entities.Plane;

public class MostExpensivePlane{
    public static Plane findMostExpensive (Plane[] planes){
        if (planes == null){
            return null;
        }
        Plane mostExpensive = planes[0];
        for (int i = 1; i < planes.length; i++){
            if (planes[i] != null && planes[i].getCost () > mostExpensive.getCost ()){
                mostExpensive = planes[i];
            }
        }
        return mostExpensive;
    }
}
