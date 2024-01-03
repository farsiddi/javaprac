//Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.

package Collections;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        System.out.println("Starting with linked list");
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(23);
        list1.add(33);
        list1.add(45);
        list1.add(87);
        System.out.println(list1.size());
        System.out.println(list1);
        for (Integer i : list1) {
            System.out.println(i);
        }
    }
}
