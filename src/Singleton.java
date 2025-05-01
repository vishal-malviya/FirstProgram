public class Singleton { //only one object is created

    //step 1 create a private static variable of type class
    private static Singleton instance;

    //step 2 make its constructor private
    private Singleton(){

    }

    //step 3 provide a public static method to get instance?? //(getter)

   public static Singleton getInstance(){
      if(instance==null)
      {
          instance =  new Singleton();
      }
      return instance;
   }

}

class Mi{
    public static void main(String[] args) {
      //  Singleton instance = new Singleton(); nobody can create new object
          Singleton s= Singleton.getInstance();
        Singleton s2= Singleton.getInstance();
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s==s2);
    }
}
