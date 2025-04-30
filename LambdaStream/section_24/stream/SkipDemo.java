package LambdaStream.section_24.stream;

// skip the first n elements in the stream

import java.util.List;
import java.util.stream.Stream;

    public class SkipDemo {

        public static void main(String[] args) {

    //        Stream.generate(new Random()::nextInt).skip(5).limit(10).forEach(System.out::println);
            List<Integer> numList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numList.stream().skip(3).limit(5).forEach(System.out::println);

        Stream.iterate(0,n -> n+1).limit(10).forEach(System.out::println);
    }
}
