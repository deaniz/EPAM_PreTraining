package by.epam.preTraining.DenisChubrick.task_7.entities;

public class PassengerPlane extends Plane{
    private int seatingCapacity;

    public PassengerPlane (String name, int maxSpeedKmH, int costUSDollars, int seatingCapacity){
        super (name, maxSpeedKmH, costUSDollars);

        this.seatingCapacity = seatingCapacity;
    }
}
