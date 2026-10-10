package org.coding.codingwarrior.fastandslowpointer;

/**
 * @author nageshasriramappa
 **/
public class CircularArray {

    public static void main(String[] args) {

        int[] arr = {3, -3, 1, 1};
        System.out.println(isCircularArray(arr));
    }

    public static boolean isCircularArray(int[] arr) {

        for (int i=0; i<arr.length; i++) {
            int slow = i, fast = i;

            boolean isForward = arr[i] > 0;

            while (true) {
                slow = moveNextStep(arr, slow);
                if (isNotCycle(arr, slow, isForward)) {
                    break;
                }

                fast = moveNextStep(arr, fast);
                if (isNotCycle(arr, fast, isForward)) {
                    break;
                }

                fast = moveNextStep(arr, fast);
                if (isNotCycle(arr, fast, isForward)) {
                    break;
                }

                if (slow == fast) {
                    return true;
                }
            }
        }

        return false;
    }

    private static int moveNextStep(int[] arr, int correctPosition) {
        int next = (correctPosition + arr[correctPosition]) % arr.length;
        if (next < 0) {
            next = next + arr.length;
        }
        return next;
    }


    private static boolean isNotCycle(int[] arr, int currentPosition, boolean isForward) {
        boolean direction = arr[currentPosition] > 0;

        if ((direction != isForward) || (arr[currentPosition] % arr.length == 0)) {
            return true;
        }
        return false;
    }
}
