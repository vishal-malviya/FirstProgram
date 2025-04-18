package MultiThreading;

public class Synchronized2 implements Runnable {
    Integer count=0;

    public void run() {
        while(count < 5 ) {
           synchronized (count){
                count++;
            }
            System.out.println(Thread.currentThread().getName() +" count " + count);


        }

    }

    public static void main(String[] args) {
        Runnable r = new Synchronized2();
        Thread r1 = new Thread(r);
        Thread r2 =  new Thread(r);
        r1.start();
        r2.start();
    }
}



