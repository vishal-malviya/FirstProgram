package ExceptionHandling;

import java.text.ParseException;

public class ParseExeception {
    public static void main(String[] args) {
        try {
            String s = "ddd";
            Integer.parseInt(s);
        }
        catch(NumberFormatException p){
            System.out.println("exeception");
            //System.out.println(p.getStackTrace()[0]);
            p.printStackTrace();
        }
    }
}
