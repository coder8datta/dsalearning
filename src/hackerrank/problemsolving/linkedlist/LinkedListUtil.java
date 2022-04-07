package hackerrank.problemsolving.linkedlist;

public class LinkedListUtil {

    void printSinglyLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode curr = head;
        while (null != curr) {
            System.out.println("" + curr.data);
            curr = curr.next;
        }
    }

    SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int value) {
        SinglyLinkedListNode curr = head;
        SinglyLinkedListNode element = new SinglyLinkedListNode(value);
        if (null != curr) {
            element.next = curr;
            return element;
        }
        return element;
    }
}
