package Multithreading;

import static java.lang.Thread.sleep;

/**
 * All three threads (A, B, and C) are executing concurrently, but not strictly in the order of their priorities.
 * <br> Java Thread Priorities Are: * Hints to the thread scheduler. * Not strict rules.
 */
public class ThreadProrityDemo implements Runnable {

    private String name;

    public ThreadProrityDemo(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread name - " + name + " | count - " + i + " | Priority - " + Thread.currentThread().getPriority());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new ThreadProrityDemo("Thread A"));
        Thread threadB = new Thread(new ThreadProrityDemo("Thread B"));
        Thread threadC = new Thread(new ThreadProrityDemo("Thread C"));
        threadA.setPriority(Thread.MIN_PRIORITY);
        threadB.setPriority(Thread.MAX_PRIORITY);
        threadC.setPriority(Thread.NORM_PRIORITY);
        // for other number like 2,3 ,4 -> MIN_PRIORITY+1
        threadB.start();
        threadC.start();
        threadA.start();
    }
}
