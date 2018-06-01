package by.epam.preTraining.DenisChubrick.task_7.entities;

public class CargoPlane extends Plane{
    private int carryingCapacityKg;

    public CargoPlane (String name, int maxSpeedKmH, int costUSDollars, int carryingCapacityKg){
        super (name, maxSpeedKmH, costUSDollars);

        this.carryingCapacityKg = carryingCapacityKg;
    }


    @Override
    public String toString (){
        return "Plane: " + getName () + ", max speed: " + getMaxSpeed () + ", cost: " + getCost () + ", carrying capacity: " + carryingCapacityKg;
    }

    public void setCarryingCapacityKg (int carryingCapacityKg){
        this.carryingCapacityKg = carryingCapacityKg;
    }

    public int getCarryingCapacityKg (){
        return carryingCapacityKg;
    }
}