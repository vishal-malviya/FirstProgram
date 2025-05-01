package Java8Feature;

@FunctionalInterface

public interface FunctionalInterface2 {

    void displayName();//abstract method -- only 1


//n default method //n static method

}

class Hi implements FunctionalInterface2{
    public static void main(String[] args) {
        FunctionalInterface2 hi = new Hi();
        hi.displayName();
    }


    public void displayName() {
        System.out.println("Vibhuti Pandya");
    }
}
