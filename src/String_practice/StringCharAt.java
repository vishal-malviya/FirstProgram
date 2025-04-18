package String_practice;

import java.util.Scanner;

public class StringCharAt {


    public static void main(String args[]){
        Scanner str = new Scanner(System.in);
        Scanner stri = new Scanner(System.in);

        String str1 = str.next();// input
        String str2 = stri.next();// input


        String str3 ="";

        if(str1.length() <= str2.length())
        {
         for(int i = 0 ; i <str1.length();i++){
             str3 = str3 + str1.charAt(i) + str2.charAt(i);// charAT only takes single character
         }

         str3 = str3+str2.substring(str1.length());// takes number of index

        }
        else
        {
            for(int i = 0 ; i <str2.length();i++){
                str3 = str3 + str1.charAt(i) + str2.charAt(i);
            }
            str3 = str3+str1.substring(str2.length());
        }

        System.out.println(str3);


    }
}
