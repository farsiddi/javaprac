package Collections;

import java.util.Vector;

// Vector has some additional methods
// Vector is thread safe
// We can set the initial size of the element
// When the size is increased the new list is created with new size which is time-consuming process
// Size - actual element in the list -- -- Capacity - Reserve size for the list
public class Vector1 {
    public static void main(String[] args) {
        Vector<String> firstVector = new Vector<>();
//        Vector<String> firstVector = new Vector<>(2,3);
//        Initial capacity is 2 then if it gets full then 3 is added = 5 => 2,5,8,11 like this
        System.out.println("Capacity: "+firstVector.capacity()+"Size:"+firstVector.size());
        firstVector.add("Hello");
        firstVector.add("I am farhan");
        firstVector.add("Bottle and bag");
        System.out.println("The last element is: " + firstVector.firstElement());
        System.out.println("The last element is: " + firstVector.lastElement());


    }
}
