package by.epam.preTraining.DenisChubrick.task_7.entities;


public class PassengerPlane extends Plane{
    private int seatingCapacity;


    public PassengerPlane (){
        this ("Airbus A322", 950, 1_700_000, 134);
    }

    public PassengerPlane (String name, int maxSpeedKmH, int costUSDollars, int seatingCapacity){
        super (name, maxSpeedKmH, costUSDollars);

        this.seatingCapacity = seatingCapacity;
    }

    public PassengerPlane (PassengerPlane passengerPlane){
        this (passengerPlane.getName (), passengerPlane.getMaxSpeed (), passengerPlane.getCost (),
              passengerPlane.seatingCapacity);
    }



    public void setSeatingCapacity (int seatingCapacity){
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity (){
        return seatingCapacity;
    }



    @Override
    public int hashCode (){
        return (getMaxSpeed () + getCost ()) / seatingCapacity;
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
            PassengerPlane passPlane = (PassengerPlane) obj;
            return getName ().compareTo (
                    passPlane.getName ()) == 0 && getMaxSpeed () == passPlane.getMaxSpeed () &&
                    getCost () == passPlane.getCost () && seatingCapacity == passPlane.seatingCapacity;
        }
        return false;
    }

    @Override
    public String toString (){
        return "Plane: " + getName () + ", max speed: " + getMaxSpeed () + ", cost: " + getCost () + ", seating capacity: " + seatingCapacity;
    }
}
