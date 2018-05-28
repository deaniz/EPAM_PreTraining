package by.epam.preTraining.DenisChubrick.task_7.utilities;

import by.epam.preTraining.DenisChubrick.task_7.entities.Airline;
import by.epam.preTraining.DenisChubrick.task_7.entities.CargoPlane;
import by.epam.preTraining.DenisChubrick.task_7.entities.PassengerPlane;
import by.epam.preTraining.DenisChubrick.task_7.entities.Plane;

public class Creator{
    public Airline createAirline (){

        PassengerPlane plane1 = new PassengerPlane ("Airbus A321", 955, 1_600_000, 152);
        PassengerPlane plane2 = new PassengerPlane ("Airbus A390", 995, 1_950_000, 140);
        PassengerPlane plane3 = new PassengerPlane ("Boeing-737", 1_000, 2_100_000, 185);
        CargoPlane plane4 = new CargoPlane ("Boeing-747 LCF", 988, 3_800_000, 113_500);

        Plane[] arrOfPlanes = new Plane[4];
        arrOfPlanes[0] = plane1;
        arrOfPlanes[1] = plane2;
        arrOfPlanes[2] = plane3;
        arrOfPlanes[3] = plane4;
        return new Airline (arrOfPlanes);
    }
}