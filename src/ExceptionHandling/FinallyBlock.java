package ExceptionHandling;

//Finally - The "finally" block is used to execute the necessary code of the program.
// It is executed whether an exception is handled or not.

public class FinallyBlock {
    public static void main(String[] args) {
    try{
        int x=10/0;
    }
    finally {
        System.out.println("INSIDE Finally"); // TRY IS Compulsory , catch is not
    }
    }
}
