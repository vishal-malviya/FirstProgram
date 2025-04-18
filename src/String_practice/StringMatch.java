
package String_practice;

import java.util.Scanner;

public class StringMatch {


    public static void main(String args[]){
        Scanner str = new Scanner(System.in);
        String str1 = str.nextLine();
        String str2 = str.nextLine();
       // Boolean str3 = str1.matches(str2);
       // System.out.println(str1.matches(str2));//EQUAL METHOD CAN BE USED
        System.out.println(str1.equalsIgnoreCase(str2));


        //cskrcb
    }
}
