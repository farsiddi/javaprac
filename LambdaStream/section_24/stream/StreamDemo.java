package LambdaStream.section_24.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//A Stream in Java represents a sequence of elements and supports different operations to perform computations on these elements.
// Streams allow for functional-style operations to be performed on collections of objects, such as filtering, mapping, reducing, and more.

//                      Process -
//1 - Create a stream of objects (.stream() | .parallelStream() | Streams.of() )
//2 - One or moew intermediate operations = Gives a new stream object
//3- Applying a terminal operation that produces a result

// Stream holds no memory | always pull elements from the datasource | LAZY(processes elemnents as needed)

public class StreamDemo {
    public static void main(String[] args) {

        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Security");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        Stream<String> departmentStream = departmentList.stream();
        departmentStream.forEach(department -> System.out.println(department));
//        departmentStream.forEach(System.out::print);  it throws an IllegalStateException because streams are single-use.
//        A stream is "consumed" when terminal operations like forEach, collect, or reduce are called.

        Stream<String> inputStream = Stream.of("Hello", "how", "boxes", "hen", "chair");
        inputStream.filter(st -> st.toLowerCase().startsWith("h")).forEach(System.out::println);


        String[] arr = {"Alex", "Carl", "Mike", "Sam"};
        Stream<String> streamArray = Arrays.stream(arr);
        streamArray.forEach(System.out::print);
//        Stream.generate(new Random()::nextInt).forEach(System.out::println);

//        Stream<String> stream1 = Arrays.stream(arr);
//        stream1.map(str -> str.toUpperCase()).forEach(System.out::println);
//        stream1.forEach(st -> System.out.println(st));


    }
}
