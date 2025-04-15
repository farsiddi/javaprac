package Multithreading;

import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Check SumThread for comparision
 */
public class MultithreadingDemo {


    public static void main(String[] args) {
        long start = System.currentTimeMillis();

//        List<Integer> list = Stream.iterate(1, num -> num + 1).limit(1000000).collect(Collectors.toList());
//        list.stream().reduce((a, b) -> a + b).ifPresent(input -> System.out.println(input));
//        Stream.iterate(1, num -> num + 1).limit(Integer.MAX_VALUE).reduce((a, b) -> a + b).ifPresent(input -> System.out.println(input));
//        long sum = LongStream.range(1, Integer.MAX_VALUE).sum();
//        System.out.println(sum);
        long result = 0;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            result += i;
        }
        System.out.println(result);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}
