package array;

import java.util.Scanner;

public class ArrInput {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int j=0 ; j < n ; j++)
        {
             arr[j] = s.nextInt();
        }
        for(int j:arr)
        {
            System.out.println(j);
        }


    }
}
