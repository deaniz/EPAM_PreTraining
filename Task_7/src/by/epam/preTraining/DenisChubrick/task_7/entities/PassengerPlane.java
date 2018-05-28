package by.epam.preTraining.DenisChubrick.task_7.entities;

public class PassengerPlane extends Plane{
    private int seatingCapacity;

    public PassengerPlane (){

    }

    public PassengerPlane (String name, int maxSpeedKmH, int costUSDollars, int seatingCapacity){
        setName (name); // call a parent constructor???
        setMaxSpeed (maxSpeedKmH);
        setCost (costUSDollars);

        this.seatingCapacity = seatingCapacity;
    }
}
