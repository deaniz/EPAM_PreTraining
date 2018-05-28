package by.epam.preTraining.DenisChubrick.task_7.entities;

public class CargoPlane extends Plane{
    private int carryingCapacityKg;

    public CargoPlane (String name, int maxSpeedKmH, int costUSDollars, int carryingCapacityKg){
        setName (name);
        setMaxSpeed (maxSpeedKmH);
        setCost (costUSDollars);

        this.carryingCapacityKg = carryingCapacityKg;
    }
}
