package Generics.Section_19;

import java.util.ArrayList;
import java.util.Objects;

public class CollectionsWithoutGenerics {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(19);
        arrayList.add("Hello");
        arrayList.add(true);

//        We could use collection without generics but everytime we need to casting manually
        String first = (String) arrayList.get(1);
        System.out.println(first);
        int second = (Integer) arrayList.get(0);
        System.out.println(second);

    }
}
