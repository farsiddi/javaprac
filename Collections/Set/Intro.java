package Collections.Set;

import java.util.*;

/**
 * No order of insertion
 * <br> Unique elements only
 * <br>Only one null element
 * <p>It stores elements using a hash table, which provides constant-time performance for basic operations like add, remove, and contains, assuming a good hash function is used. However, it does not maintain the insertion order of elements.</p>
 * <P>Since internally uses hashmap, so key is the set element and values -> Present(constant/dummy) for all the keys</P>
 */
public class Intro {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("alex");
        strings.add(null);
        strings.add("max");
        strings.add(null);
        strings.add("max");
        System.out.println(strings);
//        Set<String> strings1 = new HashSet<>(Set.of("Hello","Claas","My",null)); .of() doesnt allows null
        strings.stream().filter(str -> str != null).map(str -> str.length()).forEach(System.out::println);
        System.out.println(strings.contains("max")); // Internally it calls equals method
        if (strings.remove(null)) System.out.println("yes removed");
        System.out.println(strings);


    }
}
