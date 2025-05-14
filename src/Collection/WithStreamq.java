package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//upper case
public class WithStreamq {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("hi","Hello","ji");
       List<String> str2 =  str.stream().map(x ->x.toUpperCase()).collect(Collectors.toList());
        System.out.println(str2);
    }

}
