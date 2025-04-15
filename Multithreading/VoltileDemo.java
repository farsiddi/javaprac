package Multithreading;

/**
 * volatile keyword in Java is used to ensure visibility of changes to variables across threads.
 * <br> It prevents threads from caching the variable locally, forcing them to read it directly from the main memory every time.
 * <br>❗ However, volatile does not guarantee atomicity. For atomic operations (like count++), you still need synchronized or AtomicInteger.
 * <br> The decision of when to synchronize the loacl copy(cached) to the main memory is upto the jvm, this can lead to other threads reading the stale values of the  variables
 */
public class VoltileDemo {

    private volatile boolean flag = false;
    /**
     * A flag variable declared with the {@code volatile} keyword ensures visibility and ordering guarantees
     * in the Java Memory Model (JMM).
     *
     * <p>⚠️ <b>The Catch: No volatile = No Guarantee</b><br>
     * Without {@code volatile}, even if the program appears to work correctly, there are no guarantees that:
     * <ul>
     *   <li>Changes to the variable will be visible to other threads immediately.</li>
     *   <li>The code will work reliably in more complex scenarios.</li>
     *   <li>Loops with no I/O or sleep will break out as expected.</li>
     *   <li>The behavior will remain consistent across JVM versions or CPU architectures (e.g., ARM, multi-core systems).</li>
     * </ul>
     *
     * <p>✅ <b>volatile provides a guarantee</b><br>
     * Declaring a variable as {@code volatile} ensures that:
     * <ul>
     *   <li>Any write to the variable by one thread is immediately visible to all other threads.</li>
     *   <li>Reads and writes to the variable are not reordered by the compiler or CPU, preserving happens-before relationships.</li>
     * </ul>
     *
     * <p>This makes {@code volatile} essential for coordination between threads when using simple flags or state indicators.
     *
     * @see java.util.concurrent.atomic for more advanced atomic operations
     */

    public void stopFlag() {
        flag = true;
    }

    public void doWork() {
        while (!flag) {
            System.out.println("Working");
        }
        System.out.println("Work Stopped");
    }

    public static void main(String[] args) throws InterruptedException {
        VoltileDemo demoKey = new VoltileDemo();
        Thread workThread = new Thread(() -> demoKey.doWork());
        Thread stopThread = new Thread(() ->
        {
            try {
                Thread.sleep(3000);
                demoKey.stopFlag();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        );
        workThread.start();
        stopThread.start();
        workThread.join();
        stopThread.join();

    }
}
