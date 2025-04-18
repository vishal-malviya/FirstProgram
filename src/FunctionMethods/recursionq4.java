package FunctionMethods;

import java.util.Scanner;
//reverse a string
public class recursionq4 {

    public static char[]  splitNow(){
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        return str.toCharArray();
    }
    //abcdef
    //fed
    public static String reverseString(String str2 ,char[] arr ,int i) {
        if(i < 0)
        {
             return str2;
        }
        else
        {
            str2= str2+arr[i];
           return reverseString(str2,arr,i-1);
        }
    }

    public static void main(String[] args) {
        char[] arr = splitNow();
        String str1 = reverseString("",arr,arr.length-1);
        System.out.println(str1);

    }
}
