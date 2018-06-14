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
        Airline airline = creator.createAirline ();


        PassengerPlane plane5 = new PassengerPlane ("Airbus A340", 920, 1_550_000, 138);
        airline.enqueue (plane5);


        CargoPlane plane6 = new CargoPlane ("Boeing-747-400", 988, 3_200_000, 111_500);
        PassengerPlane plane7 = new PassengerPlane ("Airbus A320", 945, 1_600_000, 152);
        PassengerPlane plane8 = new PassengerPlane ("Airbus A380", 1_050, 1_900_000, 158);
        Plane[] severalPlanes = new Plane[3];
        severalPlanes[0] = plane6;
        severalPlanes[1] = plane7;
        severalPlanes[2] = plane8;
        airline.enqueueSeveralPlanes (severalPlanes);
        Plane tmp = airline.getHead ();
        while (true){
            if (tmp.getNext () != null){
                Printer.printOut (tmp);
                tmp = tmp.getNext ();
            }
            else{
                Printer.printOut (tmp);
                break;
            }
        }


        Printer.printOut (airline.isEmpty ());


        Printer.printOut (airline.getHead ()); // Airbus A321
        Printer.printOut (airline.dequeue ()); // Airbus A321
        Printer.printOut (airline.hasThisPlane ("Airbus A321"));


        Printer.printOut(TotalCost.countTotalCost (airline.getHead ()));
        Printer.printOut(MostExpensivePlane.findMostExpensive (airline.getHead ()));


        Printer.printOut (airline.getCurrentPlanesAmount ());


        airline.clearAirline ();


        Printer.printOut (airline.isEmpty ());


        Printer.printOut (airline.getHead ());
    }
}