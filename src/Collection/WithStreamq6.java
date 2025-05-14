package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

//class- POJO student -- get set
public class WithStreamq6{
    public static void main(String[] args) {

       Student s1 = new Student();
       s1.setMarks(90);
       s1.setName("Vishal");
       s1.setSubject1("maths");

        Student s2 = new Student();
       s2.setMarks(90);
        s2.setName("Vishal C");
        s2.setSubject1("maths");

       List<Student> list = new ArrayList<>();
       list.add(s1);
       list.add(s2);

       Double average = list.stream().mapToInt(x-> x.getMarks()).average().orElse(0.0);

        System.out.println(average);
    }
}

class Student{
    private  String subject1;
    private String name;
    private int marks;

    public void setSubject1(String subject1){
        this.subject1 =subject1;
    }
    public String getSubject1(){
        return subject1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getMarks(){
       return this.marks;
    }

    public void setMarks(int marks)
    {
        this.marks = marks;
    }

}
