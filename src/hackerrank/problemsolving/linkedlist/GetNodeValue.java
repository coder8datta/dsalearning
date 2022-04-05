package hackerrank.problemsolving.linkedlist;

public class GetNodeValue {

    void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode curr = head;
        while (null != curr) {
            System.out.println("" + curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

    }

}
