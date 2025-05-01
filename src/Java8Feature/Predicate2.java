package Java8Feature;

import java.util.function.Predicate;

public class Predicate2 {
    public static void main(String[] args) {
        Predicate<Integer> p = (x) -> {Boolean r =  x >  10 ; return r;};
        System.out.println(p.test(20));
    }
}
