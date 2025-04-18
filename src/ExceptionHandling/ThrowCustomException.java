package ExceptionHandling;

import org.w3c.dom.ls.LSOutput;

import java.text.ParseException;

//thow - to throw custom exception or to explicitly throw an exception
//throws - The "throws" keyword is used to declare exceptions.
// It specifies that there may occur an exception in the method.
// It doesn't throw an exception. It is always used with method signature.
public class ThrowCustomException {

    public static void throwingException() throws ArithmeticException {

        int x= 10/0; //exception

    }

    public static void main(String[] args) throws MyException {
      try {
          throwingException();
      }
      catch (ArithmeticException p) {
          throw new MyException("Internal Error");
        }

    }

}

class MyException extends Exception {

public MyException(String s){
    super(s);
}

}