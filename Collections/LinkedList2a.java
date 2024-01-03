
package Collections;

public class LinkedList2a {
    private Node head;
    private Node tail;
    private int size;


    public LinkedList2a() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;

    }

    public void insertAtIndex(int val, int index) {
        if (index == 0) {
            insertLast(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;

        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }
    public int deleteFirst(){
         int val = head.value;
         head = head.next;
         if (head == null){
             tail = null;
         }
         size--;
        System.out.println(val);
        return val;
    }
    //    Just to the get the reference of a given index
    public Node getRef(int index){
        Node node = head;
        for (int i = 0 ; i < index ; i++){
            node  = node.next;

        }
//        System.out.println(node.value);
        return node;
    }
    public Node findNodeWithValue(int value){
        Node node = head;
       while (node != null){
           if (node.value == value){
               return node;
           }
           node = node.next;
       }
//        System.out.println(node.value);
        return null;
    }
    public int deleteLast(){
        if (size <= 1){
            deleteFirst();
        }
//      Getting the second last reference because we can point the next reference as a tail
        Node secondLast = getRef(size - 2);
        int val = tail.value;
        tail = secondLast;
//        Tail
        tail.next = null;
        System.out.println(val);
        return val;
    }
    public  int deleteAtIndex(int index){
        if (index == 0){
            return deleteFirst();
        }
        if (index == size-1){
            return deleteLast();
        }
        Node prev = getRef(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;

    }



    public void displayValue() {
        Node temp = head;
        System.out.println("Start");
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;

        }
        System.out.println("End");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
