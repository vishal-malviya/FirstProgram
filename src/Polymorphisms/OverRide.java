package Polymorphisms;

public class OverRide {
    public static int calculate(int x, int y){
        int sum = x+y;
        return sum;
    }
}

class Child extends OverRide{
    public static int calculate(int x, int y){
        int mul= x*y;
        return mul;
    }
}

class Child2 extends OverRide{

}

class Main{
    public static void main(String[] args) {
        Child chi = new Child();
        System.out.println(chi.calculate(5,20000));


        System.out.println(Child2.calculate(5,5));

    }
}
