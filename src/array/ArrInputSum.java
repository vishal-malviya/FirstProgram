package array;

import java.util.Scanner;

public class ArrInputSum {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int j=0 ; j < n ; j++)
        {
             arr[j] = s.nextInt();
        }
        int x=0;

        for(int j:arr)
        {
        x=x+j;
        }
        System.out.println(x);


    }
}
