package ExceptionHandling;

public class ExeceptionHandling {

    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        }
        catch(ArithmeticException e){
            System.out.println("inside exe");
        }
        System.out.println("hi");
    }
}
