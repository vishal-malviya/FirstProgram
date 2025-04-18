package Polymorphisms;
//compile time
public class OverLoad {
    public static int calculate(int x , int y){
        int sum = x+y;
        return sum;
    }
    public static int calculate(int x, int y , int z) {
        int mul = x*y*z;
        return mul;
    }
    public static double calculate(int x, double y) {
        double mul = x*y;
        return mul;
    }
    public static double calculate(double x,  int y) {
        double mul = x*y;
        return mul;
    }



}
