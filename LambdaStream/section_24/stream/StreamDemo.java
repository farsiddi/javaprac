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
// Once the stream object is traversed(used a terminal operation once) cannot used again(Gives IllegalStateException)
// input -> intermediate operations(can have multiple) -> terminal operation -> output
//              intermediate operations gives a new stream object

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
        Map<String, String> capitals = new HashMap<>();
        capitals.put("Karnataka", "Bangalore");
        capitals.put("Punjab", "Chandigarh");
        capitals.put("Rajasthan", "Jaipur");

//        Stream str = Stream.of(capitals);
        Stream<Map.Entry<String, String>> str = capitals.entrySet().stream();

//        str.map(key -> key.getKey()).forEach(System.out::println);
        str.forEach(state -> System.out.println("State - " + state.getKey() + " and capital - " + state.getValue()));

        String[] arr = {"Alex", "Carl", "Mike", "Sam"};
        Stream<String> streamArray = Arrays.stream(arr);
        streamArray.forEach(System.out::print);
//        Stream.generate(new Random()::nextInt).forEach(System.out::println);

//        Stream<String> stream1 = Arrays.stream(arr);
//        stream1.map(str -> str.toUpperCase()).forEach(System.out::println);
//        stream1.forEach(st -> System.out.println(st));


    }
}
