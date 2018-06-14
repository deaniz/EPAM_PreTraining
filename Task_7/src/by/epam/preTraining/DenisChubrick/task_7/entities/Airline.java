package by.epam.preTraining.DenisChubrick.task_7.entities;


public class Airline{
    public static final int DEFAULT_SEAT_AMOUNT = 10;


    private Plane[] planes;
    private int currentPlanesAmount;


    public Airline (){
        planes = new Plane[DEFAULT_SEAT_AMOUNT];
    }
    public Airline (Plane[] arrOfPlanes){
        planes = new Plane[arrOfPlanes.length];
        for (int i = 0; i < arrOfPlanes.length; i++){
            planes[i] = arrOfPlanes[i];
            currentPlanesAmount++;
        }
    }
    public Airline (Airline airline){
        this (airline.planes); // field currentPlanesAmount is not copied????????
    }



    public void setPlanes (Plane[] planes){
        this.planes = planes;
    }

    public void setCurrentPlanesAmount (int currentPlanesAmount){ // is needed?????????
        this.currentPlanesAmount = currentPlanesAmount;
    }

    public Plane[] getPlanes (){
        return planes;
    }

    public int getCurrentPlanesAmount (){
        return currentPlanesAmount;
    }



    @Override
    public int hashCode (){
        final int prime = 3;
        int result = 1;
        result = prime * result + planes.length;
        result = prime * result + planes[0].getCost () / 1_000;
        result = prime * result + planes[0].getMaxSpeed ();
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
        if (getClass () == obj.getClass ()){ // obj instanceof Airline
            Airline airline = (Airline) obj;
            if (planes.length != airline.planes.length){
                return false;
            }
            for (int i = 0; i < airline.planes.length; i++){
                if (planes[i] != airline.planes[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString (){
        return "Amount of planes " + currentPlanesAmount;
    }



    public void addPlane (Plane plane){
        if (currentPlanesAmount == planes.length){
            expandPlanes ();
        }
        planes[currentPlanesAmount] = plane;
        currentPlanesAmount++;
    }


    public void addSeveralPlanes (Plane[] severalPlanes){ // an intermediary???
        int j = planes.length - severalPlanes.length;
        if (severalPlanes.length < planes.length && planes[j] == null && !needsExpansion (j)){
            for (int i = 0; i < severalPlanes.length; i++, j++){
                planes[j] = severalPlanes[i];
                currentPlanesAmount++;
            }
        }
        else{
            expandPlanes ();
            int k = planes.length / 2;
            for (int i = 0; i < severalPlanes.length; i++, k++){
                planes[k] = severalPlanes[i];
                currentPlanesAmount++;
            }
        }
    }


    private boolean needsExpansion (int j){
        for (int i = j + 1; i < planes.length; i++){
            if (planes[i] != null){
                return true;
            }
        }
        return false;
    }


    private void expandPlanes (){
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


    public boolean hasThisPlane (String plName){
        for (int i = 0; i < planes.length; i++)
            mark:{
                if (planes[i] == null){
                    i++;
                    break mark;
                }
                if (planes[i].getName ().toLowerCase ().equals (plName.toLowerCase ())){
                    return true;
                }
            }
        return false;
    }


    public void deletePlane (int plNumber){
        planes[plNumber] = null;
        currentPlanesAmount--;
    }


    public void clearAirline (){
        planes = null;
        currentPlanesAmount = 0;
    }
}