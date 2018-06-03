package by.epam.preTraining.DenisChubrick.task_7.entities;


public class Airline{
    public static final int NUM = 20;


    private Plane[] stack;
    private int maxSize;
    private int top;



    public Airline (){
        maxSize = NUM;
        stack = new Plane[maxSize];
        top = -1;
    }

    public Airline (int maxSize){
        this.maxSize = maxSize;
        stack = new Plane[maxSize];
        top = -1;
    }

    public Airline (Airline airline){
        Airline newAirline = new Airline ();
        newAirline.stack = airline.stack;
        newAirline.maxSize = airline.maxSize;
        newAirline.top = airline.top;
    }



    public void setStack (Plane[] stack){
        this.stack = stack;
    }

    public void setMaxSize (int maxSize){
        this.maxSize = maxSize;
    }

    public void setTop (int top){
        this.top = top;
    }

    public Plane[] getStack (){
        return stack;
    }

    public int getMaxSize (){
        return maxSize;
    }

    public int getTop (){
        return top;
    }



    public void push (Plane plane){
       stack[++top] = plane;
    }

    public Plane peek(){
        if (stack == null){
            return null;
        }
        return stack[top];
    }

    public Plane pop (){
        if (stack == null){
            return null;
        }
        return stack[top--];
    }

    public boolean isEmpty (){
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public boolean hasThisPlane (String plName){
        if (top == -1 && stack == null){
            return false;
        }
        for (int i = 0; i <= top; i++){
            if (stack[i].getName ().toLowerCase ().equals (plName.toLowerCase ())){
                return true;
            }
        }
        return false;
    }

    public void clearAirline (){
        top = -1;
    }
}