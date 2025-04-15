package Multithreading;

import static java.lang.Thread.sleep;

/**
 * Method	Thread Created?	Runs Asynchronously?	Output Thread
 * <br>   run()	❌ No	❌ No	main
 * <br>start()	✅ Yes	✅ Yes	Thread-0, Thread-1, etc.
 */
public class ImportantMethodThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();
        t3.setName("MyThread");

        long t1Id = t1.threadId();
        long t2Id = t2.threadId();
        long t3Id = t3.threadId();

        String t1Name = t1.getName();
        String t2Name = t2.getName();
        String t3Name = t3.getName();
        System.out.println("Thread Id - " + t1Id + " | Thread name - " + t1Name);
        System.out.println("Thread Id - " + t2Id + " | Thread name - " + t2Name);
        System.out.println("Thread Id - " + t3Id + " | Thread name - " + t3Name);
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName() + " - " + currentThread.threadId());

        long start = System.currentTimeMillis();

        for (int i = 0; i < 5; i++) {
            System.out.print(1);
            sleep(1000);
        }
        System.out.println();
        long end = System.currentTimeMillis();
        System.out.println((end - start)/1000);


    }
}
