package Constructor;

public class ConstructorChain {
    public ConstructorChain(){
        System.out.println("Super called");
    };
    public ConstructorChain(int x){
        this();
        System.out.println("super paramaterized");

    }
}

class ChildChain extends ConstructorChain{
 public ChildChain(){
     super(); // constructor chaining
     System.out.println("child");

 }
}

class  Main{

public static void main(String[] args) {
    ChildChain ch = new ChildChain();

}
        }