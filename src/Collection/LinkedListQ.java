package Collection;

//Sorting -searching slow
//insertion - deletion fast
//Node - element storage , previous and next node address.
//Types -  Singly linked list - element , next node add
// doubly linked list - element , next and previous node add
//circular linked list - element , tail will carry head node add

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListQ {
    public static void main(String[] args) {
        List<Integer> nw = new LinkedList<>();

        nw.add(3);
        nw.add(5);
        nw.add(4);
        nw.add(9);

        Collections.sort(nw);//list of

        System.out.println(nw.get(1));
    }
}
