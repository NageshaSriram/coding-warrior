package org.coding.codingwarrior.fastandslowpointer;

import java.util.Arrays;

/**
 * @author nageshasriramappa
 **/
public class FindDuplicate {

    static void main(String[] args) {
        int[] input = {2, 5, 8, 6, 8, 3, 9, 8, 1, 7};
        int res = findDuplicate(input);
        System.out.println("Duplicate number is "+ res);

    }

    private static int findDuplicate(int[] arr) {
        int slow = arr[0], fast = arr[0];
        while (true) {
            slow = arr[slow];
            fast = arr[arr[fast]];
            if (slow == fast) {
                break;
            }
        }

        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        return fast;
    }

    private static int findDuplicateV3(int[] arr) {
        Arrays.sort(arr);
        for (int i=1;i<arr.length;i++) {
            if (arr[i] == arr[i-1]) {
                return arr[i];
            }
        }
        return -1;
    }

    private static int findDuplicateV2(int[] arr) {
        int result = -1;

        for (int i=0;i<arr.length-1;i++) {
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return result;
    }

    static int findDuplicateV1(int[] arr) {
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
