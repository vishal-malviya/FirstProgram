package Collection;

//List is ordered(sequence) collection of same type of objects (Wrapper)
//duplicate is allowed in list
//size dynamically grows
//uses internal array
//searching and sorting fast
//manipulation insertion deletion slow

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
      ArrayListP p = new ArrayListP();
      p.display();

    }
}

class ArrayListP {
    void display(){

        List<Integer> list = new ArrayList<>(); //initialize
        list.add(2);//to add element
        list.add(3);//to add element
        System.out.println(list.get(0));//get element using index
        System.out.println(list.size());//get size of list
        list.remove(0);//removal of element at index 0
        System.out.println(list.size());

    }
}
