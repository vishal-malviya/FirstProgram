package FunctionMethods;

import java.util.Scanner;

//give a string , reverse each word while keeping order intact

public class StringBuilderq2 {

public static String[] SplitNow(){
    Scanner sc =new Scanner(System.in);
    String str = sc.nextLine();// Java is awesome
    String[] str1 =str.split(" ");
    return str1;
}

public static StringBuilder ReverseNow(String[] str1){

    StringBuilder result = new StringBuilder("");

    for(int i=0 ; i < str1.length ;i++){

        StringBuilder sb = new StringBuilder(str1[i]);
        result.append(sb.reverse()).append(" ");;
    }
    return result;
}

    public static void main(String[] args) {

       String[] str1 = SplitNow();
       StringBuilder result = ReverseNow(str1);
        System.out.println(result);




    }
}
