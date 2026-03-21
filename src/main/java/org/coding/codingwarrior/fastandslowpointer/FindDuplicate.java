package org.coding.codingwarrior.fastandslowpointer;

/**
 * @author nageshasriramappa
 **/
public class FindDuplicate {

    static void main(String[] args) {
        int[] input = {1, 1, 1};
        int res = findDuplicate(input);
        System.out.println("Duplicate number is "+ res);

    }

    static int findDuplicate(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];

        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        slow = arr[0];

        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
}
