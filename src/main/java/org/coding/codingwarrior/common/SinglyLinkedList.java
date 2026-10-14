package org.coding.codingwarrior.common;

/**
 * @author nageshasriramappa
 **/
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    Node head;

    // 1. Insert a new node at the end of the list (append)
    public void insert(int data) {
        Node node = new Node(data);

        if ( head == null) {
            head = node;
        } else {
            Node temp = head;

            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    // 2. display linked list
    public void display(Node head) {
        if (head != null) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp =  temp.next;
            }
            System.out.println("null");
        }
    }
}
