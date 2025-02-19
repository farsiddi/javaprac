package Generics.Section_19;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnboundedWildcardDemo {
    public static void main(String[] args) {
        List<Integer> lstIntegers = Arrays.asList(1, 2, 4);
        List<String> stringList = Arrays.asList("Hello", "how", "are", "you", "?");
        printElements(lstIntegers);
        printElements(stringList);
// above two lines of code works because its an unbounded wildcard
//  use when a logic needs to be excecuted irrespective of the datatype
    }

    public static void printElements(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
