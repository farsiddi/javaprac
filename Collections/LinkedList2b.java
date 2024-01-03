package Collections;

public class LinkedList2b {
    public static void main(String[] args) {
        LinkedList2a list1 = new LinkedList2a();
//        System.out.println(list1);
        list1.insertFirst(21);
        list1.insertFirst(45);
        list1.insertFirst(34);
        list1.insertFirst(95);
        list1.insertFirst(66);
        list1.insertFirst(64);
        list1.insertLast(9999);
//        list1.displayValue();
//        list1.insertAtIndex(1001,2);
//        list1.displayValue();
//        list1.deleteFirst();
        list1.displayValue();
//        list1.getRef(2);
//        list1.deleteLast();
//        list1.displayValue();
        System.out.println(list1.deleteAtIndex(3));
        list1.displayValue();
    }
}
