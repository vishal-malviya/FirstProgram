package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WithStreamq5 {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.name= "Vibhuti";
        e1.department = "CS";
        e1.salary = 50000000;

        Employee e2 = new Employee();
        e2.name= "Vishal";
        e2.department = "IT";
        e2.salary = 40000000;

        List<Employee> list = Arrays.asList(e1,e2);
        List<Employee> l = list.stream().filter(x->x.department.equals("IT")).collect(Collectors.toList());
        System.out.println(l);


    }
}

class Employee {
    String name;
    String department;
    int salary ;

    //tostring covert into print into string  format if we have made a class.
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}