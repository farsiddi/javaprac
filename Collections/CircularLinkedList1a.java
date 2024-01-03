package Collections;

public class CircularLinkedList1a {

    private Node head;
    private Node tail;

    public CircularLinkedList1a() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;

    }
    public void display(){
        Node node = head;
        System.out.println("Start");
        if (head != null){
            do {

                System.out.println(node.val);
                node = node.next;
            }while (node != head);
        }
        System.out.println("End");
    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
