package by.epam.preTraining.DenisChubrick.task_7.businessLogic;

import by.epam.preTraining.DenisChubrick.task_7.entities.Plane;

public class MostExpensivePlane{
    public static Plane findMostExpensive (Plane head){
        if (head == null){
            return null;
        }
        Plane mostExpensive = head;
        Plane tmp = head;
        while (true){
            if (tmp.getNext () != null){
                if (tmp.getNext ().getCost () > mostExpensive.getCost ()){
                    mostExpensive = tmp.getNext ();
                    tmp = tmp.getNext ();
                }
                else{
                    tmp = tmp.getNext ();
                }
            }
            else{
                break;
            }
        }
        return mostExpensive;
    }

}
