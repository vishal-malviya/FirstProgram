package array;

import java.util.Scanner;

public class ArrInputEven {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = s.nextInt();
        }


        for (int j : arr) {
            if (j % 2 != 0) {
                System.out.println(j + " odd");
            } else {
                System.out.println(j + " even");
            }
        }


    }
}
