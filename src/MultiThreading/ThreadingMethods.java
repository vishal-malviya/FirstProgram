package MultiThreading;

public class ThreadingMethods implements Runnable {

 public void run(){
      String v = " hahaahaha <3";
     try {
         Thread.sleep(500);
     } catch (InterruptedException e) {
         throw new RuntimeException(e);
     }
     //Thread.currentThread();//get current thread object working on action.
     System.out.println(Thread.currentThread().getName() +v);//get name of thread
 }

}

class Mythread2 {
    public static void main(String[] args) throws InterruptedException {
        Runnable v = new ThreadingMethods();
        Thread v1 = new Thread(v);
        Thread v2 = new Thread(v);
        v1.setDaemon(true);
        v1.start();
        v2.start();
        v2.join(200);//wait for 1st thread //It waits for a thread to die.
        System.out.println(v1.isAlive());//check if thread is running or finished
        v1.setName("weee");//set name of thread
        v2.setPriority(1);//set priority of thread
        System.out.println(v2.getPriority());//priority of thread
        Thread.yield();//It causes the currently executing thread object to pause and allow other threads to execute temporarily.
        System.out.println(v2.isDaemon());//check if thread is daemon or not
        //v1.notify();//It is used to give the notification for only one thread which is waiting for a particular object.
        //v1.notifyAll();//It is used to give the notification to all waiting threads of a particular object.
       // v1.setDaemon(true);//It marks the thread as daemon or user thread.
//        A daemon thread in Java is a background thread that runs in support of other threads. Unlike regular user threads, daemon threads do not prevent the JVM from shutting down—they automatically terminate once all user threads finish execution.
//
//                Characteristics of Daemon Threads:
//        Low Priority: They typically perform background tasks such as garbage collection or monitoring.
//
//                Ends with JVM: The JVM does not wait for daemon threads to finish; it exits as soon as all user threads are done.
//
//        Used for Background Services: Ideal for tasks that don’t need to keep the application running.
    }
}
