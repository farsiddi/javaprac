package Multithreading;

/**
 * Always use start() for true multithreading as it creates a new thread.
 */
public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());

    }

    public static void main(String[] args) {
        RunnableDemo task = new RunnableDemo();
        Thread thread = new Thread(task);
        thread.start();

        task.run();
    }
}

