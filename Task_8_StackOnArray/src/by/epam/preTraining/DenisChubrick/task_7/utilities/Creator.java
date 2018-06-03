package by.epam.preTraining.DenisChubrick.task_7.utilities;


import by.epam.preTraining.DenisChubrick.task_7.entities.Airline;
import by.epam.preTraining.DenisChubrick.task_7.entities.CargoPlane;
import by.epam.preTraining.DenisChubrick.task_7.entities.PassengerPlane;


public class Creator{
    public Airline createAirline (){
        int maxSize = 10;
        Airline airline = new Airline (maxSize);
        PassengerPlane plane1 = new PassengerPlane ("Airbus A321", 955, 1_600_000, 152);
        PassengerPlane plane2 = new PassengerPlane ("Airbus A390", 995, 1_950_000, 140);
        PassengerPlane plane3 = new PassengerPlane ("Boeing-737", 1_000, 2_100_000, 185);
        CargoPlane plane4 = new CargoPlane ("Boeing-747 LCF", 988, 3_800_000, 113_500);
        PassengerPlane plane5 = new PassengerPlane ("Airbus A340", 920, 1_550_000, 138);

        airline.push (plane1);
        airline.push (plane2);
        airline.push (plane3);
        airline.push (plane4);
        airline.push (plane5);
        return airline;
    }
}