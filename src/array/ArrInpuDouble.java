package array;

import java.util.Scanner;

public class ArrInpuDouble {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] =s.nextDouble();

        }
        for (int i =0; i< n ;i++){
            System.out.println(arr[i]);
        }
    }


}
