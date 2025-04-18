package MultiThreading;


//Java provides Thread class to achieve thread programming. Thread class provides constructors and methods to create and perform operations on a thread.
// Thread class extends Object class and implements Runnable interface.

public class Threading1 extends Thread {

    //1st way of creating thread

 public void run(){
     System.out.println("Thread is running");
 }


}

class MyThread{
    public static void main(String[] args) {
        Threading1 th1 = new Threading1();
        th1.start();

    }
}