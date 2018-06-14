package by.epam.preTraining.DenisChubrick.task_7.entities;


public class Plane{
    private String name;
    private int maxSpeedKmH;
    private int costUSDollars;
    Plane prev; // default???????



    public Plane (){
        this ("plane", 900, 1_500_000);
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

    public Plane getPrev (){
        return prev;
    }



    @Override
    public int hashCode (){
        final int prime = 3;
        int result = 1;
        result = prime * result + maxSpeedKmH;
        result = prime * result + costUSDollars / 1_000;
        result = prime * result + name.length ();
        return result;
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