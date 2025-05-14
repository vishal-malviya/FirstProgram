package Collection;

//list of string filter which has more than 3 charaters

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WithStreamq3 {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("aaa","bbbbb","c","vishal","vibhuti");
      //  List<String> str2 = str.stream().filter(x->x.length() > 3).collect(Collectors.toList());
        Long str2 = str.stream().filter(x->x.length() > 3).count(); //count elements in list and return long
        System.out.println(str2);
    }


}
