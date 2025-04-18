package ExceptionHandling;

public class Exception2 {
    public static void display() throws ArithmeticException{

           int x = 10 / 0;

    }

    public static void main(String[] args) {
        try {
            display();
        }
        catch(ArithmeticException p){
          p.printStackTrace();
        }
    }
}
