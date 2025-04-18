package String_practice;

import java.util.Scanner;

public class Stringquestion {


    public static void main(String args[]){
        Scanner str = new Scanner(System.in);
        Scanner stri = new Scanner(System.in);

        String str1 = str.next();// input
        String str2 = stri.next();// input


        String[] arr = str1.split(""); // array ch
        String[] arr2 = str2.split(""); // array ch

        String str3 ="";

        if(str1.length() <= str2.length())
        {
         for(int i = 0 ; i <str1.length();i++){
             str3 = str3 + arr[i] + arr2[i];
         }

         for(int j = str1.length() ;j < str2.length() ; j++)
         {
             str3= str3 + arr2[j];
         }

        }
        else
        {
            for(int i = 0 ; i <str2.length();i++){
                str3 = str3 + arr[i] + arr2[i];
            }
            for(int j = str2.length() ;j < str1.length() ; j++)
            {
                str3= str3 + arr[j];
            }
        }

        System.out.println(str3);


    }
}
