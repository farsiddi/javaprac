package LambdaStream.section_24.stream.flatMap;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PersonDemo {
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("Alex", Arrays.asList("123", "456")),
                new Person("Carl", Arrays.asList("000", "111"))
        );

        List<List<String>> mapStream = personList.stream()
                .map(ps -> ps.getPhoneNum()).collect(Collectors.toList());
        mapStream.forEach(System.out::println);

//        List<String> flatResult = mapStream.stream().flatMap(List::stream);
        mapStream.stream().flatMap(List::stream).forEach(num -> System.out.print(" " + num));

        System.out.println("\nAnother way");
        List<String> flatMapResult = personList.stream().flatMap(ps -> ps.getPhoneNum().stream()).collect(Collectors.toList());
        flatMapResult.forEach(System.out::println);


    }
}
