package by.epam.preTraining.DenisChubrick.task_7.entities;

import by.epam.preTraining.DenisChubrick.task_7.entities.Plane;

public class Airline{
    private Plane[] planes; // = new Plane[10]; ???
    private int currentPlanesAmount;


    public Airline (){
        planes = new Plane[10];
        currentPlanesAmount = 0;
    }

    public Airline (Plane[] arrOfPlanes){
        planes = new Plane[10];
        for (int i = 0; i < arrOfPlanes.length; i++){
            planes[i] = arrOfPlanes[i];
            currentPlanesAmount++;
        }
    }

    /*public Airline(int planesAmount){
        this.currentPlanesAmount = planesAmount;
        planes = new Plane[planesAmount];
    }
    */


    public void addPlane (Plane plane){
        if (currentPlanesAmount == planes.length){ // currentPlanesAmount == planes.length
            expandPlanes ();
        }
        planes[currentPlanesAmount] = plane;
        currentPlanesAmount++;
    }

    public void addSeveralPlanes (Plane[] severalPlanes){
        int elem = planes.length - severalPlanes.length;

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

    /*
    public void showAllPlanes(){
        for (int i = 0; i < planes.length; i++){
            System.out.println (planes[i].getName () + ", ");
        }
    }
    */


    public void deletePlane (int plNumber){
        planes[plNumber] = null;
    }


    public void clearAirline (){
        planes = null;
    }
}

/*

if (severalPlanes.length < planes.length){
            if (planes[elem] == null && !needsExpansion (elem)){
                for (int i = 0; i < severalPlanes.length; i++, elem++){
                    planes[elem] = severalPlanes[i];
                }
            }
            else {
                expandPlanes ();
                int elmnt = planes.length / 2;
                for (int i = 0; i < severalPlanes.length; i++, elem++){
                    planes[elmnt] = severalPlanes[i];
                }
            }
        }

        else {
            expandPlanes ();
            int elmnt = planes.length / 2;
            for (int i = 0; i < severalPlanes.length; i++, elmnt++){
                planes[elmnt] = severalPlanes[i];
            }
        }

 */






/*
public void addSeveralPlanes(Plane[] severalPlanes){
        int elem = planes.length - severalPlanes.length;
        if (severalPlanes.length < planes.length){
            if (planes[elem] == null){
                for (int i = 0; i < severalPlanes.length; i++, elem++){
                    planes[elem] = severalPlanes[i];
                }
            }
            else {
                expandPlanes ();
                for (int i = 0; i < severalPlanes.length; i++, elem++){
                    planes[elem] = severalPlanes[i];
                }

            }
        }
        else {
            expandPlanes ();
        }
    }
 */