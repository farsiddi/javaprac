package Collections;

public class DoubleLinkedList1b {
    public static void main(String[] args) {
        DoubleLinkedList1a doublell = new DoubleLinkedList1a();
        doublell.insertFirst(23);
        doublell.insertFirst(87);
        doublell.insertFirst(35);
        doublell.insertFirst(11);
        doublell.insertFirst(59);
        doublell.display();
        doublell.displayReverse();
        doublell.insertLast(999);

        doublell.display();

        doublell.insertAfterValue(11,555);
        doublell.display();


    }
}
