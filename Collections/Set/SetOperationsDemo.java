package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class SetOperationsDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(6);
        set1.add(8);
        set1.add(81);
//        set1.add(11);
//        set1.add(12);
//        set1.add(8);
//        set1.add(3);
//        set1.add(19);
        Set<Integer> set2 = new HashSet<>();
        set2.add(11);
        set2.add(12);
        set2.add(8);
        set2.add(3);
        set2.add(19);
//        set1.addAll(set2);   // Union
//        System.out.println(set1);
//        set1.retainAll(set2);
//        System.out.println(set1); // Intersection
//        set1.removeAll(set2); // Difference
        System.out.println(set1);
        System.out.println(set1.containsAll(set2));
    }
}
