package String_practice;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        String s1=str.nextLine();
        String[] arr = s1.split(",");

        for (int i= 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }



    }
}
