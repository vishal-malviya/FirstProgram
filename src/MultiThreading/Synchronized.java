package MultiThreading;
//using method
public class Synchronized implements Runnable {
    Integer count=0;

    public synchronized void updateCount(){
        this.count++;
    }


    public void run() {
        for(int i=0;i< 5; i++) {
            updateCount();
            System.out.println(Thread.currentThread().getName() +" count " + count);

        }

    }

    public static void main(String[] args) {
        Runnable r = new Synchronized();
        Thread r1 = new Thread(r);
        Thread r2 =  new Thread(r);
        r1.start();
        r2.start();
    }
}



