package FunctionMethods;

import java.util.Scanner;

// palindrome true or false NAMAN

public class StringBuilderq4 {

 public static void PalindromeOrNot(){
     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     StringBuilder sb = new StringBuilder(str);

     if(sb.reverse().toString().equals(str))
     {
         System.out.println(str+" Palindrome");
     }
     else {
         System.out.println(str+" Not a Palindrome");
     }
 }

    public static void main(String[] args) {
        PalindromeOrNot();
    }
}
