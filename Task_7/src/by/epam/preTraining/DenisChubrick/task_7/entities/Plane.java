package by.epam.preTraining.DenisChubrick.task_7.entities;

public class Plane{
    private String name;
    private int maxSpeedKmH;
    private int costUSDollars;

    public void setName(String name){
        this.name = name;
    }
    public void setMaxSpeed(int maxSpeedKmH){
        this.maxSpeedKmH = maxSpeedKmH;
    }
    public void setCost(int costUSDollars){
        this.costUSDollars = costUSDollars;
    }

    public String getName(){
        return name;
    }
    public int getMaxSpeed(){
        return maxSpeedKmH;
    }
    public int getCost(){
        return costUSDollars;
    }




    /*protected Plane(){
        maxSpeed = 0;
        cost = 0;
    }
    */

    /*protected Plane(float maxSpeed, float cost){
        this.maxSpeed = maxSpeed;
        this.cost = cost;
    }
    */

}
