package FunctionMethods;

import java.util.Scanner;

public class StringBuilderQ5 {

    public static String[] splitNow()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        return str.split(" ");
    }

    public static void anagramOrNot(String[] arr){
        StringBuilder str1 = new StringBuilder(arr[0].toUpperCase());
        String[] arr2 = arr[1].toUpperCase().split("");
        boolean result = false;
        if (str1.length() == arr[1].length()){
            for(int i =0; i<str1.length() ; i++){
                if(str1.indexOf(arr2[i]) != -1)
                {
                    result = true;

                }
                else {
                    result = false;
                    System.out.println(arr[0]+arr[1]+"Not a anagram");
                    break;
                }
            }

        }
        else{
            System.out.println(arr[0]+ " " + arr[1]+" Not a anagram");
        }
        if (result){
            System.out.println(arr[0]+ " "+ arr[1]+" an anagram");
        }
    }

    public static void main(String[] args) {
       String[] arr = splitNow();
       anagramOrNot(arr);
    }
}
