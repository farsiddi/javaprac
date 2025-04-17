package Collections.maps;

import java.security.Key;
import java.util.*;

public class IteratingHashMap {

    public static void main(String[] args) {

        var countryCapital = new HashMap<String, String>();
        countryCapital.put("India", "New Delhi");
        countryCapital.put("England", "London");
        countryCapital.put("Germany", "Berlin");
        countryCapital.put("France", "Paris");
        countryCapital.put("Russia", "Moscow");
//        System.out.println(countryCapital);

//        for (Map.Entry<String, String> entry : countryCapital.entrySet()) {
//        }
//        System.out.println(entry.getKey() + "_" + entry.getValue());
        Set<Map.Entry<String, String>> entries = countryCapital.entrySet();
//        System.out.println(entries);
//        approach1(countryCapital);
//        approach2(countryCapital);

//        When we need only the values and no concern about the keys
        Collection<String> values = countryCapital.values();
        for (String val : values) {
            System.out.println(val);
        }


    }

    static void approach1(HashMap<String, String> map1) {
        Set<String> keys = map1.keySet();
//        for (String key : keys) {
//            System.out.println(key + " - " + map1.get(key));
//        }
//        or
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String capital = map1.get(key);
            System.out.println(key + " - " + capital);
        }
    }

    static void approach2(HashMap<String, String> map1) {
        Set<Map.Entry<String, String>> keyValue = map1.entrySet();
        for (Map.Entry<String, String> key : keyValue) {
            System.out.println(key.getKey() + "-" + key.getValue());
        }
    }
}