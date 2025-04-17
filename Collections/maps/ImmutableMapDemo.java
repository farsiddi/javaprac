package Collections.maps;

import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map stringMap = Map.of("car", 1, "bike", 2, "bus", 3);
        System.out.println(stringMap);
//        stringMap.put("train", 7); throws UnsupportedOperationException

//        Map.ofEntries: This method takes multiple Map.entry objects and creates an immutable map containing those entries.
        Map<String, Integer> map1 = Map.ofEntries(Map.entry("Apple", 2), Map.entry("Banana", 3), Map.entry("Orange", 4), Map.entry("Guava", 5));
        System.out.println(map1);
//        map1.put("Melon", 8);
//        System.out.println(map1);throws UnsupportedOperationException
//        stringMap.put("car",2);
//        No addition or deletion can happen in both of them
    }
}
