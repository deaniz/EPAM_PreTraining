package by.epam.preTraining.DenisChubrick.task_7.utilities;

import by.epam.preTraining.DenisChubrick.task_7.entities.Plane;

public class Airline{
    private Plane[] planes;
    private int currentPlanesAmount;


    public Airline(){
        planes = new Plane[10];
    }

    public Airline(int planesAmount){
        this.currentPlanesAmount = planesAmount;
        planes = new Plane[planesAmount];
    }


    public void addPlane(Plane plane){
        if (planes[planes.length - 1] != null){ // currentPlanesAmount == planes.length
            expandPlanes ();
        }
        planes[currentPlanesAmount] = plane;
        currentPlanesAmount++;
    }

    public void expandPlanes(){
        Plane[] tmpPlanes = new Plane[planes.length * 2];
        for (int i = 0; i < planes.length; i++){
            tmpPlanes[i] = planes[i];
        }
        planes = tmpPlanes;
        tmpPlanes = null;
    }
}