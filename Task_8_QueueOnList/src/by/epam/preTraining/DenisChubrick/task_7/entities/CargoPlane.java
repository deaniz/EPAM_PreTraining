package by.epam.preTraining.DenisChubrick.task_7.entities;


public class CargoPlane extends Plane{
    private int carryingCapacityKg;



    public CargoPlane(){
        this("Boeing-747 LCF", 988, 3_800_000, 113_500);
    }

    public CargoPlane (String name, int maxSpeedKmH, int costUSDollars, int carryingCapacityKg){
        super (name, maxSpeedKmH, costUSDollars);

        this.carryingCapacityKg = carryingCapacityKg;
    }

    public CargoPlane(CargoPlane cargoPlane){
        this (cargoPlane.getName (), cargoPlane.getMaxSpeed (), cargoPlane.getCost (),
              cargoPlane.carryingCapacityKg);
    }



    public void setCarryingCapacityKg (int carryingCapacityKg){
        this.carryingCapacityKg = carryingCapacityKg;
    }

    public int getCarryingCapacityKg (){
        return carryingCapacityKg;
    }



    @Override
    public int hashCode (){
        return (getMaxSpeed () + getCost ()) / carryingCapacityKg;
    }

    @Override
    public boolean equals (Object obj){
        if (obj == null){
            return false;
        }
        if (this == obj){
            return true;
        }
        if (getClass () == obj.getClass ()){
            CargoPlane cargoPlane = (CargoPlane) obj;
            return getName ().compareTo (
                    cargoPlane.getName ()) == 0 && getMaxSpeed () == cargoPlane.getMaxSpeed () &&
                    getCost () == cargoPlane.getCost () && carryingCapacityKg == cargoPlane.carryingCapacityKg;
        }
        return false;
    }

    @Override
    public String toString (){
        return "Plane: " + getName () + ", max speed: " + getMaxSpeed () + ", cost: " + getCost () + ", carrying capacity: " + carryingCapacityKg;
    }
}