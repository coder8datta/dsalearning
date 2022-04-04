package datastructures.linkedlist;

public class LinkedList {

    Node head;

    static class Node {
        int value;
        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }
}
