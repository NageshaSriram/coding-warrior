package org.coding.codingwarrior.common;

import java.util.Arrays;

/**
 * @author nageshasriramappa
 **/
public class SumOfArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4};

        int sum = (arr.length - 1) * ((arr.length - 1) + 1) / 2;

        int arrTotal = Arrays.stream(arr).reduce(0, (a,  b) -> a + b);

        int missingNum = arrTotal - sum;
        System.out.println("Sum " + sum);
        System.out.println("missingNum " + missingNum);
    }
}
