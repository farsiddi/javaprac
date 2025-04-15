package Multithreading;

/**
 * Producer thread -> wait till the consumer thread consumes
 * <br> Consumer thread -> notify the Producer once the consumption is completed
 */
public class ImportantMethodThreadDemo2 {

    private int data;
    private Boolean isEmpty = true;

    synchronized void produce(int value) {

        while (!isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        isEmpty = false;
        System.out.println("Produced : " + value);
        notify();
    }

    /**
     * This class demonstrates a simple example of method synchronization using the `synchronized` keyword.
     * <p>
     * The `produce` and `consume` methods are synchronized to ensure that only one thread can execute them at a time
     * on the same instance of the object. This prevents data inconsistencies and ensures thread-safety.
     *
     * <p>When you write:</p>
     * <pre>
     *     synchronized void produce(int value) { ... }
     * </pre>
     * <p>It is equivalent to:</p>
     * <pre>
     *     void produce(int value) {
     *         synchronized (this) {
     *             // your logic
     *         }
     *     }
     * </pre>
     * <p>Both the `produce` and `consume` methods lock on the same object (`this`), ensuring mutual exclusion on the
     * critical section where shared resources are accessed or modified.</p>
     *
     * <p>Both methods must be synchronized on the same object to avoid deadlock and ensure proper coordination between
     * producer and consumer threads.</p>
     *
     * @see #produce(int)
     * @see #consume()
     */

    synchronized int consume() {
        while (isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int consumedData = data;
        isEmpty = true;
        System.out.println("Cosumed Data - " + consumedData);
        notify();
        return consumedData;
    }

    public static void main(String[] args) {

        ImportantMethodThreadDemo2 methodThreadDemo = new ImportantMethodThreadDemo2();


        Thread producerThread = new Thread(
                () -> {
                    for (int i = 0; i < 5; i++) {
                        methodThreadDemo.produce(i);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
        producerThread.start();
        Thread consumerThread = new Thread(
                () -> {
                    for (int i = 0; i < 5; i++) {
                        methodThreadDemo.consume();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
        consumerThread.start();
    }
}