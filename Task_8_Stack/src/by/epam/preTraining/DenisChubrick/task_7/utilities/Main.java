package by.epam.preTraining.DenisChubrick.task_7.utilities;

import by.epam.preTraining.DenisChubrick.task_7.businessLogic.MostExpensivePlane;
import by.epam.preTraining.DenisChubrick.task_7.businessLogic.TotalCost;
import by.epam.preTraining.DenisChubrick.task_7.entities.Airline;
import by.epam.preTraining.DenisChubrick.task_7.entities.CargoPlane;
import by.epam.preTraining.DenisChubrick.task_7.entities.PassengerPlane;
import by.epam.preTraining.DenisChubrick.task_7.entities.Plane;


public class Main{
    public static void main (String[] args){
        Creator creator = new Creator ();
        view (creator.createAirline ());
    }


    public static void view (Airline airline){
        System.out.println ("Current amount of planes: " + airline.getCurrentPlanesAmount ());


        PassengerPlane plane5 = new PassengerPlane ("Airbus A340", 920, 1_550_000, 138);
        airline.push (plane5);
        print (airline);


        CargoPlane plane6 = new CargoPlane ("Boeing-747-400", 988, 3_200_000, 112_630);
        PassengerPlane plane7 = new PassengerPlane ("Airbus A320", 945, 1_600_000, 152);
        PassengerPlane plane8 = new PassengerPlane ("Airbus A380", 1_050, 1_900_000, 158);
        Plane[] severalPlanes = new Plane[3];
        severalPlanes[0] = plane6;
        severalPlanes[1] = plane7;
        severalPlanes[2] = plane8;
        airline.pushSeveral (severalPlanes);
        print (airline);


        System.out.println ("Stack is empty: " + airline.isEmpty ());


        airline.pop ();
        print (airline);


        System.out.println ("Boeing-747-400 is in the stack: " + airline.hasThisPlane ("boEing-747-400"));


        Plane[] arrOfPlanes = airline.criterionSearch ("aiRBUS");
        for (int i = 0; i < arrOfPlanes.length; i++){
            if (arrOfPlanes[i] != null){
                System.out.print (arrOfPlanes[i].getName () + "; ");
            }
        }
        System.out.println ();


        int totalCost = TotalCost.countTotalCost (airline.getHead ());
        System.out.println ("Total cost of all the planes: " + totalCost);


        Plane mostExpensive = MostExpensivePlane.findMostExpensive (airline.getHead ());
        System.out.println (
                "Most expensive plane: " + mostExpensive.getName () + ", cost: " + mostExpensive.getCost ());


        airline.clearAirline ();
        System.out.println ("Airline is empty: " + airline.isEmpty ());
    }


    public static void print (Airline airline){
        if (airline.getHead () == null){
            System.out.println ("Stack is empty");
            return;
        }
        Plane tmpHead = airline.getHead ();
        System.out.println ("Name: " + tmpHead.getName ());
        while (tmpHead.getPrev () != null){
            tmpHead = tmpHead.getPrev ();
            System.out.println ("Name: " + tmpHead.getName ());
        }
        System.out.println ();
    }
}