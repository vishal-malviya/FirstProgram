package array;

import java.util.Scanner;

//Given two arrays, find all elements that are common in both arrays.
public class ArrayQ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //arr1 ki value
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        for(int i = 0 ;i<arr1.length ; i++){
            int n = sc.nextInt();
            arr1[i] = n;
        }
        //arr2 ki value
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for(int i = 0 ;i<arr2.length ; i++){
            int n = sc.nextInt();
            arr2[i] = n;
        }
        //Match arrays
        int[] arr3 = new int[n2];
        int k =0;
        System.out.print("Common Element");
        for(int i = 0; i < arr2.length ; i++)
        {
            for (int j=0 ; j< arr1.length;j++){
                if(arr1[j]==arr2[i]){
                    System.out.print(" "+arr2[i]);}

                }
            }

    }
}
