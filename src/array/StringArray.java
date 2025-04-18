package array;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String s = "HOW ARE YOU";
        int n = str.nextInt();
        String[] arr = new String[n];

        for(int i=0 ;i < n ;i++){
            arr[i] = str.next();
        }

    }
}
