package by.epam.preTraining.DenisChubrick.task_7.utilities;

import by.epam.preTraining.DenisChubrick.task_7.businessLogic.Searcher;
import by.epam.preTraining.DenisChubrick.task_7.businessLogic.Sorter;
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


        // printout all the planes
        airline.addSeveralPlanes (severalPlanes);
        for (int i = 0; i < airline.getPlanes ().length; i++){
            Printer.printOut (airline.getPlanes ()[i]);
        }
        System.out.println ();


        // binary sort by name
        Plane[] binarySortedArr = Sorter.useBinarySort (airline.getPlanes (), 0, airline.getPlanes ().length - 1);
        for (int i = 0; i < binarySortedArr.length; i++){
            Printer.printOut (binarySortedArr[i]);
        }
        System.out.println ();


        // bubble sort by cost
        Plane[] bubbleSortedArr = Sorter.useBubbleSort (airline.getPlanes ());
        for (int i = 0; i < bubbleSortedArr.length; i++){
            Printer.printOut (bubbleSortedArr[i]);
        }
        System.out.println ();


        // insertion sort by max speed
        Plane[] insertionSortedArr = Sorter.useInsertionSort (airline.getPlanes ());
        for (int i = 0; i < insertionSortedArr.length; i++){
            Printer.printOut (insertionSortedArr[i]);
        }
        System.out.println ();


        // use linear search to find the most expensive
        Plane plane = Searcher.useLinearSearch (airline.getPlanes ());
        Printer.printOut (plane);


        // get the index of a plane that costs 1_900_000
        Plane[] selectionSortedArr = Sorter.useSelectionSort (airline.getPlanes ());
        int index = Searcher.useBinarySearch (selectionSortedArr, 1_900_000);
        Printer.printOut (index);
    }
}