package by.epam.preTraining.DenisChubrick.task_7.businessLogic;


import by.epam.preTraining.DenisChubrick.task_7.entities.CargoPlane;
import by.epam.preTraining.DenisChubrick.task_7.entities.PassengerPlane;
import by.epam.preTraining.DenisChubrick.task_7.entities.Plane;


public class SearchEngine{
    public static PassengerPlane[] findPlanesWithManySeats (Plane[] planes){ // seating capacity >= 150
        PassengerPlane tmpPlane;
        int counter = 0;
        for (Plane i : planes){
            if (i instanceof PassengerPlane){
                counter++;
            }
        }
        PassengerPlane[] result = new PassengerPlane[counter];
        for (int i = 0, j = 0; i < planes.length; i++){
            if (planes[i] instanceof PassengerPlane){
                tmpPlane = (PassengerPlane) planes[i];
                if (tmpPlane.getSeatingCapacity () >= 150){
                    result[j++] = tmpPlane;
                }
            }
        }
        return result;
    }



    public static CargoPlane[] findPlanesWithGoodCarrCapacity (Plane[] planes){ // carrying capacity >= 113_000 kg
        CargoPlane plane;
        int counter = 0;
        for (Plane i : planes){
            if (i instanceof CargoPlane){
                counter++;
            }
        }
        CargoPlane[] result = new CargoPlane[counter];
        for (int i = 0, j = 0; i < planes.length; i++){
            if (planes[i] instanceof CargoPlane){
                plane = (CargoPlane) planes[i];
                if (plane.getCarryingCapacityKg () >= 113_000){
                    result[j++] = plane;
                }
            }
        }
        return result;
    }
}
