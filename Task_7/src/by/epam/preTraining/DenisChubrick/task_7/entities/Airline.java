package by.epam.preTraining.DenisChubrick.task_7.entities;


public class Airline{
    public static final int DEFAULTSEATAMOUNT = 10;


    private Plane[] planes;
    private int currentPlanesAmount;


    public Airline (){
        planes = new Plane[DEFAULTSEATAMOUNT];
    }

    public Airline (Plane[] arrOfPlanes){
        planes = new Plane[arrOfPlanes.length];
        for (int i = 0; i < arrOfPlanes.length; i++){
            planes[i] = arrOfPlanes[i];
            currentPlanesAmount++;
        }
    }

    public Airline (Airline airline){
        this (airline.planes);
    }


    public void setPlanes (Plane[] planes){
        this.planes = planes;
    }

    public Plane[] getPlanes (){
        return planes;
    }

    public int getCurrentPlanesAmount (){
        return currentPlanesAmount;
    }


    public void addPlane (Plane plane){
        if (currentPlanesAmount == planes.length){
            expandPlanes ();
        }
        planes[currentPlanesAmount] = plane;
        currentPlanesAmount++;
    }


    public void addSeveralPlanes (Plane[] severalPlanes){
        int elem = planes.length - severalPlanes.length; // an intermediary???

        if (severalPlanes.length < planes.length && planes[elem] == null && !needsExpansion (elem)){
            for (int i = 0; i < severalPlanes.length; i++, elem++){
                planes[elem] = severalPlanes[i];
                currentPlanesAmount++;
            }
        }
        else{
            expandPlanes ();
            int elmnt = planes.length / 2;
            for (int i = 0; i < severalPlanes.length; i++, elmnt++){
                planes[elmnt] = severalPlanes[i];
                currentPlanesAmount++;
            }
        }
    }


    private boolean needsExpansion (int elem){
        for (int i = elem + 1; i < planes.length; i++){
            if (planes[i] != null){
                return true;
            }
        }
        return false;
    }


    public int getCurrentPlaneAmount (){
        return currentPlanesAmount;
    }


    public void expandPlanes (){
        Plane[] tmpPlanes = new Plane[planes.length * 2];
        for (int i = 0; i < planes.length; i++){
            tmpPlanes[i] = planes[i];
        }
        planes = tmpPlanes;
        tmpPlanes = null;
    }


    public boolean isEmpty (){
        if (planes == null){
            return true;
        }
        for (int i = 0; i < planes.length; i++){
            if (planes[i] != null){
                return false;
            }
        }
        return true;
    }


    public Plane getInfo (int i){
        return planes[i];
    }


    @Override
    public int hashCode (){
        return (planes[0].getCost () + planes[0].getMaxSpeed ()) / planes.length;
    }

    @Override
    public boolean equals (Object obj){
        if (obj instanceof Airline){
            Airline airline = (Airline) obj;
            if (planes.length != airline.planes.length){
                return false;
            }
            for (int i = 0; i < airline.planes.length; i++){
                if (planes[i] != airline.planes[i]){
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public String toString (){
        return "Amount of planes " + currentPlanesAmount;
    }

    public boolean hasThisPlane (String plName){
        for (int i = 0; i < planes.length; i++)
            mark:{
                if (planes[i] == null){
                    i++;
                    break mark;
                }
                if (planes[i].getName ().equals (plName)){
                    return true;
                }
            }
        return false;
    }


    public Plane[] criterionSearch (String planeName){ //if (planes[i].getName ().toLowerCase ().indexOf (planeName.toLowerCase ()) != -1){
        Plane[] planeArray = new Plane[planes.length];
        for (int i = 0; i < planes.length; i++){
            if (planes[i].getName ().toLowerCase ().contains (planeName.toLowerCase ())){
                planeArray[i] = planes[i];
            }
        }
        return planeArray;
    }


    public void deletePlane (int plNumber){
        planes[plNumber] = null;
    }


    public void clearAirline (){
        planes = null;
    }
}