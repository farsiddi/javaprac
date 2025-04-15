package Multithreading;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

/**
 * A race condition occurs when two or more threads access shared data at the same time, and the final outcome depends on the sequence or timing of their execution.
 * <br>
 * Because the threads are racing to access and modify the data, it can lead to unpredictable results or bugs that are hard to reproduce.
 * <br>Use synchronization or atomic variables to avoid it.
 */
public class RaceConditionDemo {
    private int count = 0;

    void incerement() {
        count++;
    }
    //    synchronized void incerement() {
//        count++;
//    }

    public static void main(String[] args) throws InterruptedException {
        RaceConditionDemo conditionDemo = new RaceConditionDemo();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                conditionDemo.incerement();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                conditionDemo.incerement();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(conditionDemo.count); // Expected - 20000 (even if you get 20000 it doesnt mean is it is thread safe - modern cpus and jvm optimisation)

    }

}
