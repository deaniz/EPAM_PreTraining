package by.epam.preTraining.DenisChubrick.Task_8_Palindrome;

public class Container{
    private Node head;



    public Container (){
        head = new Node ('a');
    }



    public Node getHead (){
        if (head == null){
            return null;
        }
        return head;
    }

    public void setHead (Node head){
        this.head = head;
    }



    private void push (Node node){
        node.setPrev (head);
        head = node;
    }


    private Node pop (){
        if (head == null){
            return null;
        }
        Node tmpN = head;
        head = head.getPrev ();
        return tmpN;
    }


    public boolean isPalindrome (String str){
        char[] array = str.toCharArray ();
        for (int i = 0; i < array.length; i++){
            push (new Node (array[i]));
        }
        Node head;
        for (int i = 0; i < array.length / 2; i++){
            head = pop ();
            if (head != null && head.getData () != array[i]){
                return false;
            }
        }
        return true;
    }
}
