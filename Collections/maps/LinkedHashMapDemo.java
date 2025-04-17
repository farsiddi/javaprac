package Collections.maps;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Its a class
 * <br>  It maintains a doubly-linked list running through all its entries, which defines the order of iteration
 * <br> Maitains insertion order.
 * <br>Allows one null key and multiple null values
 * <br>Can be configured to maintain access order instead of insertion order by passing true to the constructor's accessOrder parameter.
 */
public class LinkedHashMapDemo { // extends HashMap and implelemt SequenceMap
    public static void main(String[] args) {
        Map<Integer, String> values = new LinkedHashMap<>();
        values.put(2, "Two");
        values.put(23, "Twenty Three");
        values.put(40, "Fourty");
        values.put(11, "Eleven");
        values.put(7, "Seven");
        values.put(19, "Ninetenn");
        for (Map.Entry entry : values.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
//            Output maintained the insertion order
        }
    }
}
