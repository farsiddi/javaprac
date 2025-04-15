package Multithreading;

import static java.lang.Thread.sleep;

/**
 * TO synchronize the executeion of the thread and wait for a specific thread to complete its processing -> use join()
 */
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started");

        Thread threadA = new Thread(() ->
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread A ,count - " + i);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadA.start();
        threadA.join();
        System.out.println("Main thread ended"); // if join() method is not present then this will execute first then the for loop start to print
//        try to comment the join method and see
    }
}
