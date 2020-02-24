package storage;

import adt.People;

public class LinkedList {
    Node head;

    public void insert(People data) {
        Node.size = Node.size + 1;
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

}
