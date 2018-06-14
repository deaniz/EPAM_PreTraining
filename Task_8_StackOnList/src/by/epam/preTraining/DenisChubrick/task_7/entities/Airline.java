package by.epam.preTraining.DenisChubrick.task_7.entities;


public class Airline{
    private int currentPlanesAmount;
    private Plane head;



    public Airline (){
        head = new Plane ();
        currentPlanesAmount++;
    }

    public Airline (Plane[] arrOfPlanes){
        for (int i = 0; i < arrOfPlanes.length; i++){
            arrOfPlanes[i].prev = head;
            head = arrOfPlanes[i];
            currentPlanesAmount++;
        }
    }

    public Airline (Airline airline){
        Airline newAirline = new Airline ();
        newAirline.head = airline.head;
    }



    public void setCurrentPlanesAmount (int currentPlanesAmount){
        this.currentPlanesAmount = currentPlanesAmount;
    }

    public void setHead (Plane head){
        this.head = head;
    }

    public int getCurrentPlanesAmount (){
        return currentPlanesAmount;
    }

    public Plane getHead (){
        if (head == null){
            return null;
        }
        return head;
    }



    public void push (Plane plane){
        plane.prev = head;
        head = plane;
        currentPlanesAmount++;
    }


    public void pushSeveral (Plane[] severalPlanes){
        for (int i = 0; i < severalPlanes.length; i++){
            severalPlanes[i].prev = head;
            head = severalPlanes[i];
            currentPlanesAmount++;
        }
    }


    public Plane pop (){
        if (head == null){
            return null;
        }
        Plane tmp = head;
        head = head.prev;
        currentPlanesAmount--;
        return tmp;
    }


    public boolean isEmpty (){
        if (head == null){
            return true;
        }
        return false;
    }


    public boolean hasThisPlane (String plName){
        Plane tmp = head;
        while (true){
            if (tmp.getName ().toLowerCase ().equals (plName.toLowerCase ())){
                return true;
            }
            if (tmp.prev != null){
                tmp = tmp.prev;
            }
            else{
                return false;
            }
        }
    }

    public void clearAirline (){
        head = null;
        currentPlanesAmount = 0;
    }
}