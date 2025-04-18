package FunctionMethods;

import java.util.Scanner;

public class RecursuionYes {

    public static String[] splitNow()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        return str.split(" ");
    }
    public static boolean recusrveNow(StringBuilder str1 ,String[] arr2 ,int i){
        if (str1.length() == i){
            return true;
        } else if (str1.indexOf(arr2[i]) == -1) {
            return false;
        } else {
            return recusrveNow(str1,arr2,i+1);
        }

    }

    public static void anagramOrNot(String[] arr){
        StringBuilder str1 = new StringBuilder(arr[0].toUpperCase());
        String[] arr2 = arr[1].toUpperCase().split("");

        if (str1.length() == arr[1].length()){
            boolean res= recusrveNow(str1,arr2,0);
            if (res){
                System.out.println(arr[0]+ " "+ arr[1]+" an anagram");
            }
            else{
                System.out.println(arr[0]+ " "+ arr[1]+" not an anagram");
            }

        }
        else{
            System.out.println(arr[0]+ " " + arr[1]+" Not a anagram");
        }

    }

    public static void main(String[] args) {
       String[] arr = splitNow();
       anagramOrNot(arr);
    }
}
