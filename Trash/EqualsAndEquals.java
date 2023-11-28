package Trash;

import java.util.Arrays;

public class EqualsAndEquals {
    public static void main(String[] args) {
        String a = "Faran";
        String b = "Faran";
//        == Comparator - Pointing to the same object - reference variable is pointing to the same object
//        System.out.println(a==b);  Gives true
//        Explicitly telling to create a new object with same name
        String c = new String("Faran");
//        System.out.println(a==c);  Gives false as it outside the pool
//        When only checking values - .equals
        System.out.println(new int[]{1,2,34,5});
        System.out.println(Arrays.toString(new int[]{1,2,34,5}));
        Integer num = new Integer(56);
        System.out.println(num);
        System.out.println(num.toString());  // toString grey cause internally it is calling the same, and you don't have to write it.

    }
}
