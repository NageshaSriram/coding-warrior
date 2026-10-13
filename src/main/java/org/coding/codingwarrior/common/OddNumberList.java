package org.coding.codingwarrior.common;

import java.util.List;
import java.util.Objects;

/**
 * @author nageshasriramappa
 **/
public class OddNumberList {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 5, 3);
//        System.out.println(isOddNumList(list));
        System.out.println(isOddNumListV1(list));
    }

    private static boolean isOddNumList(List<Integer> list) {
        for (int n: list) {
            if (n%2 == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isOddNumListV1(List<Integer> list) {
        return list.parallelStream()
                .noneMatch(n -> n%2 == 0 );
    }
}
