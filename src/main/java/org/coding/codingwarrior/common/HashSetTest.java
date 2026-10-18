package org.coding.codingwarrior.common;

import java.util.HashSet;

/**
 * @author nageshasriramappa
 **/
public class HashSetTest {

    public static void main(String[] args) {

        HashSet hashSet = new HashSet();

        for (Short i = 0; i < 100; i++) {
            hashSet.add(i);
            hashSet.remove((short)(i-1));
        }

//        hashSet.remove((short)99);

        System.out.println(hashSet);
    }
}
