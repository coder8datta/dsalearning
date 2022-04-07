package hackerrank.problemsolving.linkedlist;

import java.util.Scanner;

public class LinkedListRunner {

    private static final Scanner scanner = new Scanner(System.in);
    private static final LinkedListUtil util = new LinkedListUtil();

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.head = util.insertNodeAtHead(llist.head, llistItem);
        }

        util.printSinglyLinkedList(llist.head);
        System.out.println();
        scanner.close();
    }
}