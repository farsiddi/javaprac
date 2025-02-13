package LambdaStream.section_24.stream;

// When we need to exclude certain elements in a collction on the basis of condition
//  takes Predicate as an argument so return type is boolean

import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String[] args) {

        List<String> list = List.of("Giraffe", "Garage", "Glimpse", "Genuine", "Apple", "Banana", "Mountai", "Ocean");
        List<String> startsWith = list.stream()
                .filter(word -> word.toLowerCase().startsWith("g"))
                .collect(Collectors.toList());
        for (String word : startsWith) {
            System.out.println(word);
        }


    }
}
