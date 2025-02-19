package Logic;


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Hello");


        List<String> lst = List.of("Apple", "Banana", "Guava", "Grappes", "Melon", "Tomato", "Mango");
//        lst.stream().map(str -> str.toLowerCase()).forEach(System.out::println);
        List<Integer> lstNum = lst.stream().map(String::length).collect(Collectors.toList());
        for (Integer num : lstNum) {
//            System.out.println(num);
        }
//        System.out.println(Arrays.toString(lstNum.toArray()));

        Integer[] arr = {1, 24, 56, 87, 23, 65, 6};
        Stream<Integer> integerStream = Arrays.stream(arr);
//        integerStream.map(num -> num * 10).forEach(System.out::println);

        List<Integer> integerList = List.of(1, 4, 2, 5, 2, 5, 5, 1, 9);
//        integerList.stream().map(num -> num * num).forEach(input -> System.out.print(input + "-"));
        System.out.println();
//        integerList.stream().map(num -> num * num).distinct().forEach(integer -> System.out.print(integer + " "));
        System.out.println();
//        Stream.generate(new Random()::nextInt).limit(10).forEach(System.out::println);
        Random rnd = new Random();
//        Stream.generate(() -> rnd.nextInt(101)).limit(10).forEach(System.out::println);
//        Stream.iterate(1, n -> n + 1).limit(10).forEach(System.out::println);
        String name = "Alex ferguson";
        StringBuilder reversedName = new StringBuilder(name).reverse();
        System.out.println(reversedName);
    }
}
