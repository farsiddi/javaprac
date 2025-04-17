package Collections.Set;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ImmutableSetDemo {
    public static void main(String[] args) {
        Set<String> set = Set.of("Alex", "Carl", "Max"); // Creates Immutable set
        System.out.println(set);
        set.add("Sam"); // throws exception -  UnsupportedOperationException
        System.out.println(set);

    }
}
