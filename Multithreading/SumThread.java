package Multithreading;

/**
 * Check MultithreadingDemo` for comparision
 */
public class SumThread extends Thread {

    private int startIndex;
    private int lastIndex;
    private long result;

    public SumThread(int startIndex, int lastIndex) {
        this.startIndex = startIndex;
        this.lastIndex = lastIndex;
    }

    @Override
    public void run() {
        for (long i = startIndex; i <= lastIndex; i++) {
            result = result + i;
        }
    }

    public long getResult() {
        return result;
    }

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        SumThread thread1 = new SumThread(0, Integer.MAX_VALUE / 2);
        SumThread thread2 = new SumThread((Integer.MAX_VALUE / 2) + 1, Integer.MAX_VALUE);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        long end = System.currentTimeMillis();

        System.out.println(thread1.getResult() + thread2.getResult());
        System.out.println(end - start);


    }
}
