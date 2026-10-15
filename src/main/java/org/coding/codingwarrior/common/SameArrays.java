package org.coding.codingwarrior.common;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author nageshasriramappa
 **/
public class SameArrays {
    public static void main(String[] args) {
        Integer[] a1 = {1,2, 3, 2, 1};
        Integer[] a2 = {1, 2, 3};
        System.out.println(sameArray(a1, a2));

        int[] aa = {1,2 , 3, 4, 2};
        List<Integer> aas = Arrays.stream(aa).boxed().collect(Collectors.toList());
        Collections.sort(aas);
        System.out.println(aas);
    }

    static boolean sameArray(Integer[] a1, Integer[] a2) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(a1));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(a2));

        if (s1.size() != s2.size()) {
            return false;
        }

        for (Integer i: s1) {
            if (!s2.contains(i)) {
                return false;
            }
        }
        return true;
    }
}
