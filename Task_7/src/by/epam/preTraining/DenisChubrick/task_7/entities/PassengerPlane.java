package by.epam.preTraining.DenisChubrick.task_7.entities;

public class PassengerPlane extends Plane{
    public int seatingCapacity;

    public PassengerPlane(float maxSpeed, float cost, int seatingCapacity){
        setMaxSpeed (maxSpeed);
        setMaxSpeed (cost);

        this.seatingCapacity = seatingCapacity;
    }
}
