package org.coding.codingwarrior.common;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author nageshasriramappa
 **/
public class ForEachExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for (Integer i: list) {
            System.out.println(i);
        }


        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        list.forEach(System.out::println);

    }
}
