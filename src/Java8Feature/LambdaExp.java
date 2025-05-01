package Java8Feature;

//A lambda expression is a short block of code which takes in parameters and returns a value.
// Lambda expressions are similar to methods,
// but they do not need a name and they can be implemented right in the body of a method.
//(parameter1, parameter2) -> { code block } //code block should have return value

public class LambdaExp {
    public static void main(String[] args) {
        FunctionalInterface2 fuck = () -> {System.out.println("Vibhuti Pandya");}; //Lambda Expression
        fuck.displayName();
    }
}
