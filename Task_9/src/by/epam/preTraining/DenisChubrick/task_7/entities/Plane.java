package by.epam.preTraining.DenisChubrick.task_7.entities;


public class Plane{
    private String name;
    private int maxSpeedKmH;
    private int costUSDollars;



    public Plane (){
        this ("Airbus A322", 950, 1_700_000);
    }

    public Plane (String name, int maxSpeedKmH, int costUSDollars){
        this.name = name;
        this.maxSpeedKmH = maxSpeedKmH;
        this.costUSDollars = costUSDollars;
    }

    public Plane (Plane plane){
        this (plane.name, plane.maxSpeedKmH, plane.costUSDollars);
    }



    void setName (String name){
        this.name = name;
    }

    void setMaxSpeed (int maxSpeedKmH){
        this.maxSpeedKmH = maxSpeedKmH;
    }

    void setCost (int costUSDollars){
        this.costUSDollars = costUSDollars;
    }

    public String getName (){
        return name;
    }

    public int getMaxSpeed (){
        return maxSpeedKmH;
    }

    public int getCost (){
        return costUSDollars;
    }



    @Override
    public int hashCode (){
        return (maxSpeedKmH + costUSDollars) / maxSpeedKmH;
    }

    @Override
    public boolean equals (Object obj){
        if (obj == null){
            return false;
        }
        if (this == obj){
            return true;
        }
        if (getClass () == obj.getClass ()){ // obj instanceof Plane
            Plane plane = (Plane) obj;
            return name.compareTo (
                    plane.name) == 0 && maxSpeedKmH == plane.maxSpeedKmH && costUSDollars == plane.costUSDollars;
        }
        return false;
    }

    @Override
    public String toString (){
        return "Plane: " + name + ", max speed: " + maxSpeedKmH + ", cost: " + costUSDollars;
    }
}