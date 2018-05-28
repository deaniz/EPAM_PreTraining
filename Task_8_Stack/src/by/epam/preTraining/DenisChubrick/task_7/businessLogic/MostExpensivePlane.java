package by.epam.preTraining.DenisChubrick.task_7.businessLogic;

import by.epam.preTraining.DenisChubrick.task_7.entities.Plane;

public class MostExpensivePlane{
    public static Plane findMostExpensive (Plane head){
        Plane mostExpensive = head;
        Plane tmp = head;
        for (; ; ){
            if (tmp != null){ // mostExpensive.getPrev () != null &&
                if (mostExpensive.getPrev ().getCost () > tmp.getCost ()){
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
