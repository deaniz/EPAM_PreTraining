package by.epam.preTraining.DenisChubrick.task_7.entities;


public class Airline{
    private int currentPlanesAmount;
    private Plane head;


    public Airline (){
        head = new Plane ();
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


    public int getCurrentPlanesAmount (){
        return currentPlanesAmount;
    }

    public Plane getHead (){
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
        for (; ; ){
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


    public Plane[] criterionSearch (String planeName){
        Plane[] planeArray = new Plane[currentPlanesAmount];
        Plane tmp = head;
        for (int i = 0; i < planeArray.length; i++){
            if (tmp.getName ().toLowerCase ().contains (planeName.toLowerCase ())){
                planeArray[i] = tmp;
            }
            if (tmp.prev != null){
                tmp = tmp.prev;
            }
        }
        return planeArray;
    }


    public void clearAirline (){
        head = null;
        currentPlanesAmount = 0;
    }


    @Override
    public int hashCode (){
        return (head.getCost () + head.getMaxSpeed ()) / head.getMaxSpeed ();
    }

    @Override
    public boolean equals (Object obj){
        if (obj instanceof Airline){
            Airline airline = (Airline) obj;
            if (head != airline.head){
                return false;
            }
            Plane tmp = head;
            for (; ; ){
                //if (tmp.prev != airline.prev)
                //if (planes[i] != airline.planes[i]){
                //   return false;
                //}
            }
        }
        return false;
    }

    @Override
    public String toString (){
        return "Amount of planes " + currentPlanesAmount;
    }
}