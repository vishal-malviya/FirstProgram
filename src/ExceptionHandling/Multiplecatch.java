package ExceptionHandling;

public class Multiplecatch {


    public static void main(String[] args) {
        try {
            Integer X = null;
            int y = X/0 ;
        }
        catch (ArithmeticException a){
            System.out.println("Airthmetic");
        }
        catch (NullPointerException n){
            System.out.println("null exe");
        }
        //or in short way catch (ArithmeticException | NullPointerException n ){
        //            System.out.println("Exception");
        //        }


    }
}
