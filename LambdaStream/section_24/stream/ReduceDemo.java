package LambdaStream.section_24.stream;

//                      TERMINAL OPERATION
// Combines all elements of s stream in to a single value

import java.util.List;
import java.util.stream.Stream;

public class ReduceDemo {
    public static void main(String[] args) {

//        Stream.generate(new Random()::nextInt).limit(5).reduce((x, y) -> x + y).ifPresent(System.out::println);

        List<Integer> numList = List.of(1, 2, 3, 4, 5, 6);
        int sum = numList.stream().reduce((x, y) -> x + y).orElse(0);
        System.out.println(sum);

    }

}