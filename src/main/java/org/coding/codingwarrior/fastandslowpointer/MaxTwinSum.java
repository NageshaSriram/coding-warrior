package org.coding.codingwarrior.fastandslowpointer;

/**
 * @author nageshasriramappa
 **/
public class MaxTwinSum {

    static void main(String[] args) {
        ListNode head = new ListNode(81);
        ListNode node2 = new ListNode(144);
        ListNode node3 = new ListNode(64);
        ListNode node4 = new ListNode(121);
        ListNode node5 = new ListNode(25);
        ListNode node6 = new ListNode(49);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        System.out.println(twinSum(head));
    }

    private static int twinSum(ListNode head) {
        int max = 0;

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = slow;
        ListNode prev = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        curr = head;

        while (prev != null) {
            max = Math.max(max, curr.val + prev.val);
            curr = curr.next;
            prev = prev.next;
        }
        return max;
    }
}


class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}