package String_practice;

import java.util.Scanner;

public class StringOptimize {


    public static void main(String args[]){
        Scanner str = new Scanner(System.in);
        Scanner stri = new Scanner(System.in);

        String str1 = str.next();// input
        String str2 = stri.next();// input


        String str3 ="";

        if(str1.length() <= str2.length())
        {
         for(int i = 0 ; i <str1.length();i++){
             str3 = str3 + str1.substring(i,i+1) + str2.substring(i,i+1);
         }

         str3 = str3+str2.substring(str1.length());

        }
        else
        {
            for(int i = 0 ; i <str2.length();i++){
                str3 = str3 + str1.substring(i,i+1) + str2.substring(i,i+1);
            }
            str3 = str3+str1.substring(str2.length());
        }

        System.out.println(str3);


    }
}
