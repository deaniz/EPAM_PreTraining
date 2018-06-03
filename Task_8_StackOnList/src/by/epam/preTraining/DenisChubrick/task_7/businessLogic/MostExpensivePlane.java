package by.epam.preTraining.DenisChubrick.task_7.businessLogic;

import by.epam.preTraining.DenisChubrick.task_7.entities.Plane;

public class MostExpensivePlane{
    public static Plane findMostExpensive (Plane head){
        if (head == null){
            return null;
        }
        Plane mostExpensive = head;
        Plane tmp = head;
        for (; ; ){
            if (tmp.getPrev () != null){
                if (tmp.getPrev ().getCost () > mostExpensive.getCost ()){
                    mostExpensive = tmp.getPrev ();
                    tmp = tmp.getPrev ();
                }
                else{
                    tmp = tmp.getPrev ();
                }
            }
            else{
                break;
            }
        }
        return mostExpensive;
    }
}
