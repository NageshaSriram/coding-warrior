package org.coding.codingwarrior.common;

import java.util.Arrays;

/**
 * @author nageshasriramappa
 **/
public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 34, 65,33, 4, 1,8, 45};
//        Arrays.sort(arr);
//        System.out.println("Sorted Array :" + Arrays.toString(arr));
//        System.out.println("Second largest number: " + arr[arr.length - 2]);

        // Without sorting
        int max = 0, secondMax = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second largest without sorting :" + secondMax);
    }
}
