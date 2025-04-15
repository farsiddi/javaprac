package Multithreading;

 /**
 * A deadlock is a condition in multithreading where two or more threads are blocked forever,
 * each waiting for the other to release a resource.
 * <p>⚠️ <b>Classic Deadlock Scenario:</b><br>
 * <ul>
 *   <li>Thread A acquires <b>Lock 1</b> and waits for <b>Lock 2</b>.</li>
 *   <li>Thread B acquires <b>Lock 2</b> and waits for <b>Lock 1</b>.</li>
 *   <li>Neither thread can proceed, causing a permanent stall.</li>
 * </ul>
 * <p>🛡️ <b>Best Practices to Avoid Deadlock:</b>
 * <ul>
 *   <li><b>Consistent Lock Order:</b> Always acquire multiple locks in a predefined global order.</li>
 *   <li><b>Use Timed Locks:</b> Prefer {@code ReentrantLock.tryLock(timeout)} to avoid indefinite waiting.</li>
 *   <li><b>Keep Critical Sections Small:</b> Minimize the amount of code inside synchronized blocks.</li>
 *   <li><b>Avoid Nested Locks:</b> Try to design code to avoid acquiring a lock while holding another.</li>
 * </ul>
 * <p>Detecting and preventing deadlocks is essential for building robust concurrent applications.
 */

public class DeadLockDemo {
    public static final String str1 = "Alex";
    public static final String str2 = "Carl";

     /**
      * check  - REENTRANTLOCK.java
      */
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            synchronized (str1) {
                System.out.println("Lock Str1");
                synchronized (str2) {
                    System.out.println("Lock str2");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (str2) {
                System.out.println("Lock Str2");
                synchronized (str1) {
                    System.out.println("Lock str1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
