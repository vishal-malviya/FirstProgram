package Constructor;

public class ConstructNow{
    int x = 10;

    public void display(){
        System.out.println(x);
    }
    public ConstructNow(){ //default constructor // no return type
      //  x = 20;
    }

    public ConstructNow(int x){ // parametrized constructor
       this.x =x; // which x to be used ; this -- // to show global variable
        System.out.println(x);
    }

}

class Hoo{
    public static void main(String[] args) {
        ConstructNow cc = new ConstructNow();
        //cc.display();
    }
}
