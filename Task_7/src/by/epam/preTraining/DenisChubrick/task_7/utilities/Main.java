package by.epam.preTraining.DenisChubrick.task_7.utilities;

import by.epam.preTraining.DenisChubrick.task_7.businessLogic.MostExpensivePlane;
import by.epam.preTraining.DenisChubrick.task_7.businessLogic.SearchEngine;
import by.epam.preTraining.DenisChubrick.task_7.businessLogic.TotalCost;
import by.epam.preTraining.DenisChubrick.task_7.entities.Airline;
import by.epam.preTraining.DenisChubrick.task_7.entities.CargoPlane;
import by.epam.preTraining.DenisChubrick.task_7.entities.PassengerPlane;
import by.epam.preTraining.DenisChubrick.task_7.entities.Plane;


public class Main{
    public static void main (String[] args){
        Creator creator = new Creator ();
        Airline airline = creator.createAirline ();


        PassengerPlane plane5 = new PassengerPlane ("Airbus A340", 920, 1_550_000, 138);
        airline.addPlane (plane5);


        CargoPlane plane6 = new CargoPlane ("Boeing-747-400", 988, 3_200_000, 111_500);
        PassengerPlane plane7 = new PassengerPlane ("Airbus A320", 945, 1_600_000, 152);
        PassengerPlane plane8 = new PassengerPlane ("Airbus A380", 1_050, 1_900_000, 158);
        Plane[] severalPlanes = new Plane[3];
        severalPlanes[0] = plane6;
        severalPlanes[1] = plane7;
        severalPlanes[2] = plane8;

        airline.addSeveralPlanes (severalPlanes);
        for (int i = 0; i < airline.getPlanes ().length; i++){
            if (airline.getPlanes ()[i] != null){
                Printer.printOut (airline.getPlanes ()[i]);
            }
        }


        Printer.printOut (airline.hasThisPlane ("Airbus A320"));


        Printer.printOut (airline.isEmpty ());


        Printer.printOut (airline.getInfo (4));


        Printer.printOut (airline.getCurrentPlanesAmount ());


        Plane[] array1 = SearchEngine.findPlanesWithManySeats (airline.getPlanes ());
        for (int i = 0; i < array1.length; i++){
            if (array1[i] != null){
                Printer.printOut (array1[i]);
            }
        }


        airline.deletePlane (2); // delete Boeing-737
        Printer.printOut (airline.getCurrentPlanesAmount ());
        Printer.printOut (airline.hasThisPlane ("Boeing-737"));


        Plane[] array2 = SearchEngine.findPlanesWithGoodCarrCapacity (airline.getPlanes ());
        for (int i = 0; i < array2.length; i++){
            if (array2[i] != null){
                Printer.printOut (array2[i]);
            }
        }


        Printer.printOut(TotalCost.countTotalCost (airline.getPlanes ()));
        Printer.printOut (MostExpensivePlane.findMostExpensive (airline.getPlanes ()));


        airline.clearAirline ();
        Printer.printOut (airline.isEmpty ());
    }
}