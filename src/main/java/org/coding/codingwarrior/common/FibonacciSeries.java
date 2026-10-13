package org.coding.codingwarrior.common;

import java.util.Arrays;

/**
 * @author nageshasriramappa
 **/
public class FibonacciSeries {

    public static void main(String[] args) {
        // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
        int[] fibSeries = new int[10];
        int a = 0;
        int b = 1;
        fibSeries[0] = 0;
        fibSeries[1] = 1;
        int n = 10;
        System.out.println(Arrays.toString(fibonacciSeries(fibSeries, 2, n)));

        // method 2
        for (int i=0;i<n;i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static int[] fibonacciSeries(int[] arr, int index, int n) {
        if (index == n) {
            return arr;
        }
        arr[index] = arr[index-1] + arr[index-2];
        index++;
        return fibonacciSeries(arr, index, n);
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
