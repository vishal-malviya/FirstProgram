package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//list of string , filter elements start with A
public class WithStreamq2 {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("aaa","aba","cba","ssa","Aa");
       List<String> str2= str.stream().filter(x->x.startsWith("a") || x.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println(str2);
    }
}
