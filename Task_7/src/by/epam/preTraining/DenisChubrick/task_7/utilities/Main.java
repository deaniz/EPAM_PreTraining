package by.epam.preTraining.DenisChubrick.task_7.utilities;

import by.epam.preTraining.DenisChubrick.task_7.entities.CargoPlane;
import by.epam.preTraining.DenisChubrick.task_7.entities.PassengerPlane;

import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        System.out.print ("Enter 'p' to create a passenger airplane, 'c' to create a cargo airplane: ");
        Scanner sc = new Scanner (System.in);
        String letter = sc.next ().toLowerCase ();
        int num;
        switch (letter){
            case "p":
                System.out.print ("Enter maximum speed, cost, seating capacity: \n");
                PassengerPlane psngrPlane = new PassengerPlane (sc.nextFloat (), sc.nextFloat (), sc.nextInt ());
                System.out.print ("Enter 1 to add the plane to Airline: ");
                num = sc.nextInt ();
                if (num == 1){
                    addPassngrPlane (psngrPlane);
                }
                break;
            case "c":
                System.out.println ("Enter maximum speed, cost, carrying capacity: ");
                CargoPlane crgPlane = new CargoPlane (sc.nextFloat (), sc.nextFloat (), sc.nextFloat ());
                System.out.print ("Enter 1 to add the plane to Airline: ");
                num = sc.nextInt ();
                if (num == 1){
                    addCargoPlane (crgPlane);
                }
                break;
            default:
        }


    }


    static void addPassngrPlane (PassengerPlane psngrPlane){
        Airline company = new Airline ();
        company.addPlane (psngrPlane);
    }

    static void addCargoPlane (CargoPlane crgPlane){
        Airline company = new Airline ();
        company.addPlane (crgPlane);
    }
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

// package by.epam.preTraining.DenisChubrick.task_7.utilities;