package Mis;

public class TypeCasting {
    public static void main(String[] args) {
        int x = 99;
        short z= (short) x;//downcasting expilicit need to be done.

        int k= z; //upcasting - automatic in assignment

        double d =x; ////upcasting - automatic in assignment

        int k2= (int) d;//downcasting expilicit need to be done.

       char ch = 's';
      //  String s = ch; Not possible wrapper class

        long k3 =  ch;// askii print 115
        System.out.println(k3);

        char ch2 = (char) k2; // downcasting
        System.out.println(ch2);
/*
        Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double

        Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte*/
    }
}
