
package String_practice;

import java.util.Scanner;

public class StringIntern {


    public static void main(String args[]){

        String str1 = "HI";//string constant pool
        String str2 = new String("HI");//heap memory object
        System.out.println(str1==str2);//address match
        System.out.println(str1.equals(str2));//value match
        String str3= str2.intern();
        System.out.println(str1==str3);//makes it string constant pool
        System.out.println(str1.equals(str3));


    }
}
