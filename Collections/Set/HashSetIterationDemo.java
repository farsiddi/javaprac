package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIterationDemo {


    public static void main(String[] args) {
        Set<String> power = new HashSet<>();
        power.add("Invisibility");
        power.add("Teleportation");
        power.add("Mind reading");
        power.add("Super strength");
        power.add("time traveller");
        //
        power.add("laser vision");
        power.add("Weather manipulation");
        power.add("Shape shifting");
        power.add("Chaotic induction");

        for (String str : power) {
            System.out.println(str.toUpperCase()); // No order followed
        }
        Iterator<String> iterator = power.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name.toLowerCase());
        }
    }
}
