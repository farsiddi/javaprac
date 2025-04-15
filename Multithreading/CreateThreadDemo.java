package Multithreading;

/**
 * <p>Flow of execution:</p>
 * <ul>
 *   <li>1 - A new Thread object is created and stored in heap memory.</li>
 *   <li>2 - Calling {@code start()} triggers the creation of a new thread.</li>
 *   <li>3 - The thread is scheduled by the OS and executes the {@code run()} method.</li>
 *   <li>4 - Once execution completes, the thread moves to the "DEAD" state.</li>
 * </ul>
 * <br> When we have many IO related operation then try to make many threads othewise the CPU will be idle most the time
 */
public class CreateThreadDemo {
    public static void main(String[] args) {
        Thread thread = new Thread();
        /**
         * Schedules this thread to begin execution. The thread will execute independently of the current thread.
         * A thread can be started at most once. In particular, a thread can not be restarted after it has terminated.
         */
        thread.start();
//        thread.start(); //.IllegalThreadStateException - runtime exception - cannot use again
        Thread thread1 = new Thread(() -> System.out.println("Hello from thread"));
        thread1.start();
        Runnable runnable = () -> System.out.println("hi from runnable");
        Thread thread2 = new Thread(runnable);
        thread2.start();
//        thread2.run(); // Executes in the same thread as the caller (no multi-threading happens).
//        Always use start() instead of run() to ensure proper thread creation and parallel execution in Java.


        System.out.println("hello from main method");


    }
}