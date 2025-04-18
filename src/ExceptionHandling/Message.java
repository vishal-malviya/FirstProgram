package ExceptionHandling;

public class Message  {
    public static void main(String[] args) {
       try{ int x = 10/0;}
       catch(ArithmeticException a) {
           //System.out.println(a.getCause()); - null
           //System.out.println(a.getMessage());
           //a.printStackTrace(); - java.lang.ArithmeticException: / by zero
           //	at ExceptionHandling.Message.main(Message.java:5)
          // System.out.println(a.getStackTrace()[0]); //ExceptionHandling.Message.main(Message.java:5)
          // System.out.println(a.toString()); //java.lang.ArithmeticException: / by zero
       }
    }
}
