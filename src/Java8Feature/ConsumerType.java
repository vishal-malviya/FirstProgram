package Java8Feature;

import java.util.function.Consumer;

//TAKES argument , no return statement

public class ConsumerType {
    public static void main(String[] args) {
        Consumer<String> s = (name) -> {
            System.out.println(name);
        };
        s.accept("CHPP");
    }
}
