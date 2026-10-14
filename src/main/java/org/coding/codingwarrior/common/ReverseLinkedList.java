package org.coding.codingwarrior.common;

import java.util.LinkedList;

/**
 * @author nageshasriramappa
 **/
public class ReverseLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(50);
        list.insert(100);
        list.display(list.head);
        System.out.println("Reverse linked list");
        Node head = reverseLinkedList(list.head);
        list.display(head);

        System.out.println("--------Using buildin libs----------");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(9);
        linkedList.add(30);
        linkedList.add(40);
        System.out.println(linkedList);

        LinkedList<Integer> reversedll = new LinkedList<>();
        linkedList.descendingIterator().forEachRemaining(reversedll::add);
        System.out.println(reversedll);

    }

    private static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
