package Collections.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * It used to represent the a mapping between the keys and values.
 * <br> Its a part of the java collection interface but doesnt extend the collection interface.
 * <br>HashMaps allows single null key but multiple null values.
 * <br> Doesnt maintain insertion order
 */
public class Intro {
    public static void main(String[] args) {
        var capital = new HashMap<String, String>();
        capital.put("India", "New Delhi");
        capital.put("USA", "New York");
        capital.put("England", "London");
        capital.put("Germany", "Berlin");
        capital.put(null, null);
        capital.put(null, "key");
//        for (String st : capital.){
//            System.out.println(st.);
//        }
//        for (Map.Entry<String, String> entry : capital.entrySet()) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }

        System.out.println(capital.get(null));
    }
}