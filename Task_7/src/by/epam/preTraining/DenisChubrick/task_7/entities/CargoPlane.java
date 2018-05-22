package by.epam.preTraining.DenisChubrick.task_7.entities;

public class CargoPlane extends Plane{
    public float carryingCapacity;

    public CargoPlane(float maxSpeed, float cost, float carryingCapacity){
        setMaxSpeed (maxSpeed);
        setMaxSpeed (cost);

        this.carryingCapacity = carryingCapacity;
    }
}
