package org.coding.codingwarrior.common;

/**
 * @author nageshasriramappa
 **/
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int index = binarySearch(arr, 60, 0, arr.length-1);
        if (index < 0) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + index);
        }

    }

    private static int binarySearch(int[] arr, int n, int low, int high) {

        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;

        if (n == arr[mid]) {
            return mid;
        }

        if (arr[mid] < n) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
        return binarySearch(arr, n, low, high);
    }
}
