package LambdaStream.section_24.stream;

import java.util.*;
import java.util.stream.Collectors;

public class CollectDemo {

    public static void main(String[] args) {

        List<String> departmentList = new ArrayList<>(Arrays.asList("Marketing", "Supply", "Hr", "Food", "Security", "Food"));

        List<String> newList = departmentList.stream().filter(words -> words.toLowerCase().startsWith("s")).collect(Collectors.toList());
//        long countDesire = departmentList.stream().filter(words -> words.toLowerCase().startsWith("s")).count();
//        System.out.println(countDesire);
//        Set<String> newSet = departmentList.stream().collect(Collectors.toSet());
//        newSet.forEach(System.out::println);
        newList.forEach(System.out::println);

        String st = "hello";
        String reverseString = st.chars().mapToObj(c -> (char) c).collect(Collectors.collectingAndThen(
                Collectors.toList(), list -> {
                    Collections.reverse(list);
                    return list.stream();
                }
        )).map(String::valueOf).collect(Collectors.joining());
        System.out.println(reverseString);
    }

}
