package Collections;

public class DoubleLinkedList1a {
    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null){
            head.prev = node;
        }
        head = node;

    }
    public void display(){
        Node node = head;
        System.out.println("Start");
        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }
        System.out.println("End");

    }
    public Node getTail(){
        Node tail = head;
        while (tail != null && tail.next != null){
            tail = tail.next;
        }
        return tail;
    }
    public void displayReverse(){
        Node node = getTail();
        System.out.println("Displaying in reverse");
        System.out.println("Start");
        while (node.prev != null){
            System.out.println(node.val);
            node = node.prev;
        }
        System.out.println("End");
    }
    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if (head == null){
            node.prev = null;
            head = node;
            return;

        }
        while (last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }
//    public void displayPrevNodeVal(){
//        Node node = new Node();
//    }
    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

}
