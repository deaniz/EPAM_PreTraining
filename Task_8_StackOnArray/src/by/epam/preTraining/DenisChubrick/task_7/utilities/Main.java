package by.epam.preTraining.DenisChubrick.task_7.utilities;


import by.epam.preTraining.DenisChubrick.task_7.businessLogic.MostExpensivePlane;
import by.epam.preTraining.DenisChubrick.task_7.businessLogic.TotalCost;
import by.epam.preTraining.DenisChubrick.task_7.entities.Airline;
import by.epam.preTraining.DenisChubrick.task_7.entities.CargoPlane;
import by.epam.preTraining.DenisChubrick.task_7.entities.PassengerPlane;


public class Main{
    public static void main (String[] args){
        Creator creator = new Creator ();
        Airline airline = creator.createAirline ();


        CargoPlane plane6 = new CargoPlane ("Boeing-747-400", 988, 3_200_000, 111_500);
        PassengerPlane plane7 = new PassengerPlane ("Airbus A320", 945, 1_600_000, 152);
        PassengerPlane plane8 = new PassengerPlane ("Airbus A380", 1_050, 1_900_000, 158);
        airline.push (plane6);
        airline.push (plane7);
        airline.push (plane8);


        for (int i = 0; i <= airline.getTop (); i++){
            Printer.printOut (airline.getStack ()[i]);
        }


        Printer.printOut (airline.isFull ());


        Printer.printOut (airline.peek ()); // Airbus A380
        Printer.printOut (airline.pop ()); // Airbus A380
        Printer.printOut (airline.hasThisPlane ("Airbus A380"));


        Printer.printOut(TotalCost.countTotalCost (airline.getStack (), airline.getTop ()));
        Printer.printOut(MostExpensivePlane.findMostExpensive (airline.getStack (), airline.getTop ()));


        airline.clearAirline ();


        Printer.printOut (airline.isEmpty ());
    }
}