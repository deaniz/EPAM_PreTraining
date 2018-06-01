package by.epam.preTraining.DenisChubrick.task_7.entities;

public class PassengerPlane extends Plane{
    private int seatingCapacity;

    public PassengerPlane (String name, int maxSpeedKmH, int costUSDollars, int seatingCapacity){
        super (name, maxSpeedKmH, costUSDollars);

        this.seatingCapacity = seatingCapacity;
    }


    @Override
    public String toString (){
        return "Plane: " + getName () + ", max speed: " + getMaxSpeed () + ", cost: " + getCost () + ", seating capacity: " + seatingCapacity;
    }


    public void setSeatingCapacity (int seatingCapacity){
        this.seatingCapacity = seatingCapacity;
    }
    public int getSeatingCapacity(){
        return seatingCapacity;
    }
}
