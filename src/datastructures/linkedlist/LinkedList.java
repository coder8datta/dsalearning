package datastructures.linkedlist;


/**
 * Linked List base class.
 */
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
