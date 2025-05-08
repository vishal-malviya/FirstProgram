package Collection;

//Given two list, find all elements that are common in both list.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Integer n1 = sc.nextInt();
            list1.add(n1);
        }
        //list2 ki value

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);//
        List<Integer> list3 = new ArrayList<>();
        // Arrays is a built class which convert array into arraylist with the help of  asList method
        System.out.println("commom elements:");
        for (Integer i : list1) {
            for (Integer j : list2) {
                if (i == j) {
                    list3.add(i);
                }

            }

        }

ArrayListQ p = new ArrayListQ();
        p.removeDuplicate(list3);
    }

    public void removeDuplicate(List<Integer> list) {
      for(int a = 0 ; a < list.size() ; a++) {
          for(int b = a+1 ; b <list.size();b++)
          {
             if (list.get(a) == list.get(b)){
                 list.remove(a);
             }
          }
        }
        System.out.println(list);
    }

}

class WithStream{
    public static void main(String[] args) {
      List<String> list = Arrays.asList("1","2" ,"4","5");
      List<Integer> list2 = list.stream().map(x -> Integer.parseInt(x)).filter(x -> (x%2==0)).collect(Collectors.toList());
        System.out.println(list2);
    }
}
