package Collections.Set;

import java.util.*;

/**
 * <li>Order maintained</li>
 * <li>Usage - when there is a requirement to store unique element in a order of insertion.</li>
 */
public class LinkedHashsetDemo {
    public static void main(String[] args) {
        var stringLinkedHashSet = new LinkedHashSet<String>(); // implement sequence set
        stringLinkedHashSet.add("India");
        stringLinkedHashSet.add("Nepal");
        stringLinkedHashSet.add("Bhutan");
        stringLinkedHashSet.add("China");
        System.out.println(stringLinkedHashSet); // insertion order is maintained
//        SequencedSet<String> reversedVisitedCountries = visitedCountries.reversed();
//        System.out.println(reversedVisitedCountries);
//        SequenceSet<String> stringSequenceSet = stringLinkedHashSet.reverse
//        Need to check the above code
    }
}
