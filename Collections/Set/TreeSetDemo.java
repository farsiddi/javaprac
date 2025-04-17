package Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * <p> Store elements in a sorted manner.</p>
 * <li>Usage - when there is a requirement to store unique element in a sorted manner.</li>
 * <li> NavigableSet implementation based on a TreeMap. </li>
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(13);
        set.add(4);
        set.add(42);
        set.add(34);
        set.add(99);
        System.out.println(set); // 100% sorting order natural order(ascending order)
//       set.remove(13);
//        System.out.println(set);
//        System.out.println(set.size());
//        System.out.println(set.contains(34));
        System.out.println(set.first());
        System.out.println(set.last());
    }
}
