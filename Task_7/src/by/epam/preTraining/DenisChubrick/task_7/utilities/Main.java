package by.epam.preTraining.DenisChubrick.task_7.utilities;

import by.epam.preTraining.DenisChubrick.task_7.entities.Airline;
import by.epam.preTraining.DenisChubrick.task_7.entities.CargoPlane;
import by.epam.preTraining.DenisChubrick.task_7.entities.PassengerPlane;
import by.epam.preTraining.DenisChubrick.task_7.entities.Plane;

import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Creator creator = new Creator ();
        view (creator.createAirline ());


    }


    public static void view(Airline airline){
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



        System.out.println ("Current amount of planes: " + airline.getCurrentPlaneAmount ());



        System.out.println ("Airline park is empty: " + airline.isEmpty ());



        Plane plane = airline.getInfo (4);
        System.out.println ("Name: " + plane.getName () + "; Maximum speed: " + plane.getMaxSpeed () + "; Cost: " + plane.getCost ());



        airline.deletePlane (2);
        System.out.println ("Current amount of planes: " + airline.getCurrentPlaneAmount ());


        
        airline.clearAirline ();
        System.out.println ("Airline park is empty: " + airline.isEmpty ());



    }



/*
    static void addPassngrPlane (PassengerPlane psngrPlane){
        Airline company = new Airline ();
        company.addPlane (psngrPlane);
    }

    static void addCargoPlane (CargoPlane crgPlane){
        Airline company = new Airline ();
        company.addPlane (crgPlane);
    }
    */
}

/*
if (letter.equals ("p")){
            System.out.println ();
        }
        else if (letter.equals ("c")){
            System.out.println ();
        }
        else{
            System.out.println ("Wrong letter!");
        }
 */


/*

System.out.print ("Enter 'p' to create a passenger airplane, 'c' to create a cargo airplane: ");
        Scanner sc = new Scanner (System.in);
        String letter = sc.next ().toLowerCase ();
        int num;
        switch (letter){
            case "p":
                System.out.print ("Enter maximum speed, cost, seating capacity: \n");
                //PassengerPlane psngrPlane = new PassengerPlane (sc.nextFloat (), sc.nextFloat (), sc.nextInt ());
                System.out.print ("Enter 1 to add the plane to Airline: ");
                num = sc.nextInt ();
                if (num == 1){
                    //addPassngrPlane (psngrPlane);
                }
                break;
            case "c":
                System.out.println ("Enter maximum speed, cost, carrying capacity: ");
                //CargoPlane crgPlane = new CargoPlane (sc.nextFloat (), sc.nextFloat (), sc.nextFloat ());
                System.out.print ("Enter 1 to add the plane to Airline: ");
                num = sc.nextInt ();
                if (num == 1){
                    //addCargoPlane (crgPlane);
                }
                break;
            default:
        }

 */
// package by.epam.preTraining.DenisChubrick.task_7.utilities;