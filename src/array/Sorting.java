package array;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i < arr.length ; i++){
            int n1 = sc.nextInt();
            arr[i] = n1;
        }

        for(int j =0 ; j < arr.length-1 ; j++){
            int minindex = j;
            for(int k = j+1 ;k<arr.length;k++){
                if(arr[k]<arr[minindex]){
                    minindex=k;
                }
            }
          int temp = arr[j];
              arr[j]= arr[minindex];
              arr[minindex] = temp;


        }
        System.out.print("Sorted value:");
        for(int m=0 ; m<arr.length ;m++){
            System.out.print(" "+arr[m]);
        }
    }
}
