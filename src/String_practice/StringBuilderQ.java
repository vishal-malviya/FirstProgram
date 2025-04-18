package String_practice;

import java.util.Scanner;
import java.lang.StringBuilder;

//scan input string reverse it ,replace with * if all vowel , put hypen after every 3rd poition
public class StringBuilderQ {

    public static int isVowel(char f){
        String str2 = "aeiou";
        int d = str2.indexOf(f);
       return d;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);


        System.out.println(sb.reverse());

        for (int i = 0; i < sb.length(); i++) {
            if (isVowel(sb.charAt(i)) != -1)
            {
                sb.replace(i, i + 1, "*");
            }

        }
        for(int i=3 ; i < sb.length() ; i = i+4){
            sb.insert(i,"-");
        }

        System.out.println(sb);

    }
}
