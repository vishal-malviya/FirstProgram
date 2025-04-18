package FunctionMethods;

import java.util.Scanner;

//scan input string reverse it ,replace with * if all vowel , put hypen after every 3rd poition
public class StringBuilderQ1 {

    public static int isVowel(char f) {
        String str2 = "aeiou";
        int d = str2.indexOf(f);
        return d;

    }

    public static void reverseNow(StringBuilder sb) {

        System.out.println(sb.reverse());
    }

    public static void replaceNow(StringBuilder sb) {
        for (int i = 0; i < sb.length(); i++) {
            if (isVowel(sb.charAt(i)) != -1) {
                sb.replace(i, i + 1, "*");
            }

        }
    }

    public static void insertNow(StringBuilder sb) {
        for (int i = 3; i < sb.length(); i = i + 4) {
            sb.insert(i, "-");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);

        reverseNow(sb);
        replaceNow(sb);
        insertNow(sb);
        System.out.println(sb);

    }
}
