package by.epam.preTraining.DenisChubrick.task_7.entities;

public class PassengerPlane extends Plane{
    public int seatingCapacity;

    public PassengerPlane(String name, int maxSpeedKmH, int costUSDollars, int seatingCapacity){
        setName (name);
        setMaxSpeed (maxSpeedKmH);
        setCost (costUSDollars);

        this.seatingCapacity = seatingCapacity;
    }
}
