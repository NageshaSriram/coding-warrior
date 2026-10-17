package org.coding.codingwarrior.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author nageshasriramappa
 **/
public class MergeTwoList {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4));

        list1.addAll(list2);
        System.out.println(list1);

    }
}
