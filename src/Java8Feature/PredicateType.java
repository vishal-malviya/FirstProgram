package Java8Feature;

//boolean value return based on condition we pass on implementation

public interface PredicateType {
    Boolean checkIfNumIsGreaterThanOther(int x , int y);
}

class Check{
    public static void main(String[] args) {
        PredicateType check = (x, y) -> { Boolean r = x > y; return r;};
        System.out.println(check.checkIfNumIsGreaterThanOther(80,9000));
    }
}
