package LambdaStream.section_24.stream;

// When we want to limit the number of elements in stream
// Takes a number which indicates the size of the elements we want to limit
// Works with set also(mentioned because ordered will not be there)

import Trash.Int;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LimitDemo {
    public static void main(String[] args) {

        List<Integer> list = Stream.generate(new Random()::nextInt).limit(10).collect(Collectors.toList());
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
//        Gives a 5 digit num
//        List<Integer> lst = Stream.generate(() -> new Random().nextInt(200000) - 99999).limit(10).collect(Collectors.toList());
//        for (Integer in : lst) {
//            System.out.print(in + " ");
//        }
        System.out.println();
        Stream.generate(() -> new Random().nextInt()).limit(5).map(num -> num * 2).forEach(System.out::println);

        List<Integer> numList = List.of(1, 2, 3, 4, 5, 6, 7,  8, 9);
        numList.stream().limit(5).map(num -> num * num).forEach(System.out::println);
    }
}
