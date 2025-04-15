package Multithreading;

import java.util.stream.Stream;

/**
 * <h2>Hardware:</h2>
 * The hardware consists of the physical components of a computer, such as the CPU,
 * memory, storage, and input/output devices. The CPU is the key component
 * responsible for executing instructions.
 *
 * <h2>Operating System (OS):</h2>
 * The OS is system software that manages hardware resources and provides services
 * for computer programs. It abstracts the hardware, providing a consistent
 * interface for applications to run on different types of hardware.
 *
 * <h2>Processes:</h2>
 * A process is a program in execution. It is an independent unit that runs in its
 * own memory space. The OS manages processes, allocates resources, and provides
 * isolation between them. Each process has its own address space, file descriptors,
 * and system resources.
 *
 * <h2>Threads:</h2>
 * A thread is the smallest unit of execution within a process. Multiple threads
 * can exist within a single process. Threads within a process share the same memory
 * space, allowing for efficient communication. Threads can run concurrently, and
 * the OS schedules their execution on the CPU.
 *
 * <h2>Difference Between Processes and Threads:</h2>
 * <ul>
 *     <li><b>Process:</b> A process is an independent execution unit with its own memory space.</li>
 *     <li><b>Thread:</b> A thread is a lightweight execution unit within a process that shares memory.</li>
 *     <li>Processes provide isolation and security, while threads allow parallel execution within a process.</li>
 *     <li>Processes have higher overhead(because each process is having its own system resource) due to memory management, whereas threads have lower overhead.</li>
 * </ul>
 */

public class Intro {
    public static void main(String[] args) {
        Stream shbc = Stream.iterate(1, n -> n + 1).skip(2).limit(10);
        shbc.forEach(System.out::println);

    }

}
