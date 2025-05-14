package Collection;

import jdk.dynalink.NoSuchDynamicMethodException;

import java.util.LinkedList;

public class CustomLinkedList {
    public static void main(String[] args) {
        LinkedList<String> node = new LinkedList<>();
        node.add("90");
    }
}
class MyLinkedList {
   Node node ;
   int size = 0;

   public void addIt(String element){
       Node newnode = new Node(element);

       if(node== null){
           node = newnode;
       }
       else{
           Node temp = node;
       }
   }
}

class Node{
    String element;
    Node nextAdd;

    public Node(String element ){
        this.element = element;
        this.nextAdd = null;
    }

}

