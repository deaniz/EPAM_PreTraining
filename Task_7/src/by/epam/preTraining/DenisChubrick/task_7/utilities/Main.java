package by.epam.preTraining.DenisChubrick.task_7.utilities;

import by.epam.preTraining.DenisChubrick.task_7.businessLogic.BubbleSort;
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
        PassengerPlane plane5 = new PassengerPlane ("Airbus A340", 920, 1_550_000, 138);
        airline.addPlane (plane5);
        System.out.println ("Airline has Airbus A340: " + airline.hasThisPlane (plane5.getName ()));


        CargoPlane plane6 = new CargoPlane ("Boeing-747-400", 988, 3_200_000, 112_630);
        PassengerPlane plane7 = new PassengerPlane ("Airbus A320", 945, 1_600_000, 152);
        PassengerPlane plane8 = new PassengerPlane ("Airbus A380", 1_050, 1_900_000, 158);
        Plane[] severalPlanes = new Plane[3];
        severalPlanes[0] = plane6;
        severalPlanes[1] = plane7;
        severalPlanes[2] = plane8;
        airline.addSeveralPlanes (severalPlanes);
        System.out.println ("Airline has Boeing-747-400: " + airline.hasThisPlane (plane6.getName ()));
        System.out.println ("Airline has Airbus A320: " + airline.hasThisPlane (plane7.getName ()));
        System.out.println ("Airline has Airbus A380: " + airline.hasThisPlane (plane8.getName ()));


        System.out.println ("Current amount of planes: " + airline.getCurrentPlanesAmount ());


        System.out.println ("Airline park is empty: " + airline.isEmpty ());


        Plane plane = airline.getInfo (4);
        System.out.println (
                "Name: " + plane.getName () + "; Maximum speed: " + plane.getMaxSpeed () + "; Cost: " + plane.getCost ());


        Plane[] planeArray = airline.criterionSearch ("boeing");
        for (int i = 0; i < planeArray.length; i++){
            if (planeArray[i] != null){
                System.out.print (planeArray[i].getName () + "; ");
            }
        }


        Plane mostExpensive = MostExpensivePlane.findMostExpensive (airline.getPlanes ());
        System.out.println (
                "\nMost expensive plane: " + mostExpensive.getName () + ", cost: " + mostExpensive.getCost ());


        int totalCost = TotalCost.countTotalCost (airline.getPlanes ());
        System.out.println ("Total cost of all the planes: " + totalCost);


        Plane[] sortedArrOfPlanes = BubbleSort.sortByCost (airline.getPlanes ());
        for (Plane i : sortedArrOfPlanes){
            if (i != null){
                System.out.print (i.getCost () + "; ");
            }
        }


        airline.deletePlane (2);
        System.out.println ("\nCurrent amount of planes: " + airline.getCurrentPlanesAmount ());


        airline.clearAirline ();
        System.out.println ("Airline park is empty: " + airline.isEmpty ());
    }
}