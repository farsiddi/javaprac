package Collections.maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

/**
 * <li>A Red-black tree based implementation and stores key-value pairs in a sorted order based on the keys.</li>
 * <li>When you add key-value pairs then they are automatically  sorted by their keys</li>
 * <li>No null key allowed as no sorting can happen</li>
 * <li>Its a CLASS</li>
 */
public class TreeMapDemo { // extends AbstractMap<K,V> implements NavigableMap<K, V>,

    public static void main(String[] args) {

        Map<Integer, String> values = new TreeMap<>();
        values.put(2, "Two");
        values.put(23, "Twenty Three");
        values.put(40, "Fourty");
        values.put(11, "Eleven");
        values.put(7, "Seven");
        values.put(19, "Nineteen");

        for (Map.Entry<Integer, String> entry : values.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
//            Sorted in the output section
        }
        for (Map.Entry entry : values.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
//            Sorted in the output section
        }

    }
}
