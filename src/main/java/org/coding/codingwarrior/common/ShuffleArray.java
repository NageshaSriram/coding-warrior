package org.coding.codingwarrior.common;

import java.util.Arrays;
import java.util.Random;

/**
 * @author nageshasriramappa
 **/
public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Before Shuffle :" + Arrays.toString(arr));
        shuffleArr(arr);
        System.out.println("After Shuffle :" + Arrays.toString(arr));

    }

    static void shuffleArr(int[] arr) {
        Random random = new Random();

        for (int i=0;i<arr.length;i++) {
            int randomIndex = random.nextInt(arr.length);
            int temp = arr[randomIndex];
            arr[randomIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
