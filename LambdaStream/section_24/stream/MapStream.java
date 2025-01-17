package LambdaStream.section_24.stream;
// INTERMEDIATE operation || Functional function interface
//  Use - when we want to apply logic or transform each element of the collection(one object to another object by applying functions)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapStream {
    public static void main(String[] args) {
        List<String> teams = new ArrayList<>(Arrays.asList("csk", "kkr", "rcb", "srh"));
//        List<String> newTeam = teams.stream().map(tm -> tm.toUpperCase()).collect(Collectors.toList());
//        for (String st : newTeam) {
//            System.out.print(st + " ");
//        }
        teams.stream().map(st -> st.toUpperCase() + " ").forEach(System.out::print);
        System.out.println("Hello");
        teams.stream().map(st -> st.toUpperCase()).map(st -> "Hi, " + st).forEach(System.out::println);


// ------------FLAT  MAP --------


        System.out.println("Started FlatMap");
        String[] names = {"Alex", "Sam", "Mike"};
        Stream<String> streamObj = Arrays.stream(names);
//        [Alex] [Sam] [Mike]

        Stream<String[]> mapStream = streamObj.map(str -> str.split(""));
//        [A,l,e,x] [S,a,m] [M,i,k,e]

        mapStream.flatMap(arr -> Arrays.stream(arr)).forEach(System.out::println);
//        arr -> Arrays.stream(arr) = Arrays ::stream
//        A l e x S a m M i k e  = This is the result after flatMap


    }
}
