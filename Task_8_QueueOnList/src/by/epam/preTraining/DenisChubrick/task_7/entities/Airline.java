package by.epam.preTraining.DenisChubrick.task_7.entities;


public class Airline{
    private int currentPlanesAmount;
    private Plane head;
    private Plane tail;



    public Airline (){
        head = new Plane ();
        currentPlanesAmount++;
    }

    public Airline(Plane plane){
        if (head == null && tail == null){
            tail = plane;
            head = plane;
            currentPlanesAmount++;
            return;
        }
        tail.next = plane;
        tail = plane;
        currentPlanesAmount++;
    }

    public Airline (Plane[] arrOfPlanes){
        for (int i = 0; i < arrOfPlanes.length; i++){
            if (head == null && tail == null){
                tail = arrOfPlanes[i];
                head = arrOfPlanes[i];
                currentPlanesAmount++;
                continue;
            }
            tail.next = arrOfPlanes[i];
            tail = arrOfPlanes[i];
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

    public void setTail (Plane tail){
        this.tail = tail;
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

    public Plane getTail(){
        return tail;
    }



    public void enqueue (Plane plane){
        if (head == null & tail == null){
            tail = plane;
            head = plane;
            currentPlanesAmount++;
            return;
        }
        tail.next = plane;
        tail = plane;
        currentPlanesAmount++;
    }


    public void enqueueSeveralPlanes (Plane[] severalPlanes){
        for (int i = 0; i < severalPlanes.length; i++){
            if (head == null && tail == null){
                tail = severalPlanes[i];
                head = severalPlanes[i];
                currentPlanesAmount++;
                continue;
            }
            tail.next = severalPlanes[i];
            tail = severalPlanes[i];
            currentPlanesAmount++;
        }
    }


    public Plane dequeue (){
        if (head == null & tail == null){
            return null;
        }
        Plane tmp = head;
        head = head.next;
        currentPlanesAmount--;
        return tmp;
    }


    public boolean isEmpty (){
        if (head == null & tail == null){
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
            if (tmp.next != null){
                tmp = tmp.next;
            }
            else{
                return false;
            }
        }
    }


    public void clearAirline (){
        head = null;
        tail = null;
        currentPlanesAmount = 0;
    }

}