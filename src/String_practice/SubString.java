
package String_practice;

import java.util.Scanner;

public class SubString {


    public static void main(String args[]){
        Scanner str = new Scanner(System.in);
        String str1 = str.nextLine();
        String str2 = str.nextLine();
       String str3= str1+str2;
        //System.out.println(str3.substring(0,str1.length()));
        System.out.println(str3.substring(str1.length(),str3.length()));

        //cskrcb
    }
}
