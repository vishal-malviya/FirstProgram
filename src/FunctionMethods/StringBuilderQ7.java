package FunctionMethods;

//REVERSE A STRING

import java.util.Scanner;

public class StringBuilderQ7 {
    public static char[] splitNow(){
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        return str.toCharArray();
    }

    public static void reverseNow(char[] arr){
        String str2 ="";
        for(int i=arr.length-1 ; i >= 0 ;i--){
            str2 =str2 + arr[i];
        }
        System.out.println(str2);
    }

    public static void main(String[] args) {
        char[] arr = splitNow();
        reverseNow(arr);

    }
}
