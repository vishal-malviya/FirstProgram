package Java8Feature;

import java.util.List;
import java.util.function.Supplier;

//return a value , no parameter intake

public class SupplierType {
    public static void main(String[] args) {
        Supplier<String> so = () -> { return "hi" ;};
        System.out.println(so.get());

    }


}
