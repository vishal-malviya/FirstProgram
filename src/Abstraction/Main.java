package Abstraction;

import Inheritance.ChildN;

public class Main {
    public static void main(String[] args) {
        ParentN p = new ChildA();
        System.out.println(p.calculate(4,5));

        //p.display(); - np as reffernce object is of parent class

    }
}
