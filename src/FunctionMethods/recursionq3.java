package FunctionMethods;

import java.util.Scanner;



public class recursionq3 {

    public static int factorialNow(int n){
        if(n==0){
            return 1;
        }
        else{
           return (n)*factorialNow(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorialNow(n));

    }
}
