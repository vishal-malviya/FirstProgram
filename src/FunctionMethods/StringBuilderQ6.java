package FunctionMethods;

import java.util.Scanner;

//
public class StringBuilderQ6 {
    public static void isVowel(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder(str);

       // for(int i =0 ; i < arr.length ;i++){
       //     sb.append(arr[i]);
       // }

        String str2 = "aeiou";
        int num =0;
        int num2=0;

        for(int i =0 ; i < sb.length() ; i++){
            if (str2.indexOf(sb.substring(i,i+1)) != -1){
                num = num+1;
            }
            else if(!sb.substring(i,i+1).equals(" ")) {
                num2 =num2+1;
            }
        }
        System.out.println("number of vowel" + " " +num);
        System.out.println("number of Constant" + " " +num2);
    }


    public static void main(String[] args) {

        isVowel();
    }
}
