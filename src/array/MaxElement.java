package array;

import java.util.Scanner;

        public class MaxElement {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] arr = new int[n];

                for(int i=0 ; i < arr.length ; i++){
                    int n1 = sc.nextInt();
                    arr[i] = n1;
                }
int temp=arr[0];
                for(int j =1 ; j < arr.length; j++){
                   if (temp < arr[j]){
                       temp = arr[j];}

                }
                System.out.println(temp);
                }
            }




