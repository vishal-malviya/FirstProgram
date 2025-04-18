package FunctionMethods;
// int n -- 5 se 1 print

import java.util.Scanner;

public class Recusrsionq2 {

    public static int print(int n){
        if(n==0)
        {
           return 0;
        }
        else
        {
            System.out.println(n);
           return print(n-1);
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        print(n);

    }
}
