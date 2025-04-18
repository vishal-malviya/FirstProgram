package FunctionMethods;

import com.sun.tools.javac.Main;

import java.util.Scanner;

// string - make it camel case
public class StringBuilderq3 {

    public static String[] SplitNow(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr =  str.split(" ");
        return arr;
    }
    public static String UpperCaseNow(String[] arr){
        String sb = arr[0];

        for(int i=1 ; i <arr.length;i++){
            sb = sb + ("" + arr[i].charAt(0)).toUpperCase()+arr[i].substring(1);

        }
        return sb;
    }
    public static void main(String[] args) {

        String[] arr = SplitNow();
        String sb = UpperCaseNow(arr);
        System.out.println(sb);



    }



}
