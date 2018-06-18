package by.epam.preTraining.DenisChubrick.Task_8_Palindrome;

public class Node{
    private char data;
    private Node prev;



    public Node (char ch){
        data = ch;
    }



    public char getData (){
        return data;
    }

    public Node getPrev (){
        if (prev == null){
            return null;
        }
        return prev;
    }

    public void setData (char data){
        this.data = data;
    }

    public void setPrev (Node prev){
        this.prev = prev;
    }
}