package Encapsulation;

public class ParentE {
    private int salary = 10000000; //restricted access

    public int getSalary(){
        return salary;
    }

    private void setSalary(int officeSalary){
        salary = officeSalary;
    }

}

class Main{
    public static void main(String[] args) {
        ParentE p = new ParentE();
        System.out.println(p.getSalary());
    }
}
