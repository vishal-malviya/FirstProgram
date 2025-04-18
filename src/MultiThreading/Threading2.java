package MultiThreading;
// 2nd way of making thread
public class Threading2 implements Runnable{
    String thread_name;
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(thread_name +" counting = " +i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public Threading2(String thread_name){
        this.thread_name = thread_name;
    }
}

class Mythreding{

    public static void main(String[] args) throws InterruptedException {

        Runnable th1 = new Threading2("th1");
        Runnable th2 = new Threading2("th2");
        Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2);
        t1.start();// start a thread // run is directly called from start.
        t2.start();
        t2.sleep(10000); //Small delay to allow thread switching
    }
}
