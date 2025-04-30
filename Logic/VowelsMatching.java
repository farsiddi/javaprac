package Logic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VowelsMatching {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Alex", "Carl", "Mike", "Lynx"));
        list.stream().filter(str -> str.matches(".*[aeiou].*")).forEach(System.out::println);

        String string = "HelloWorld";

        boolean containsVowel = Stream.of(string.split("")).anyMatch(c -> "aeiouAEIOU".contains(c));
        System.out.println(containsVowel);
        string.chars().mapToObj(c -> (char) c).collect(Collectors.toMap(Function.identity(), c -> 1L, Long::sum

        )).forEach((k, v) -> System.out.println(k + "-" + v));

    }
}
