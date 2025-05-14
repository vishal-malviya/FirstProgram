package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//list of integer -- sum of all even number
public class WithStreamq4 {
    public static void main(String[] args) {
        final int[] count = {0};
        List<Integer> num = Arrays.asList(2,3,4,5,6,7,8,9,10);
        //List<Integer> num2 = num.stream().filter(x->x%2==0).map(x -> count[0] = count[0] +x).collect(Collectors.toList()); ;
        //System.out.println(count[0]);
       int num2 = num.stream().filter(x->x%2==0).mapToInt(x -> x).sum();
        System.out.println(num2);

    }
}
