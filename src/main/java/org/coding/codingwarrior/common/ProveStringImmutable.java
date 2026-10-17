package org.coding.codingwarrior.common;

/**
 * @author nageshasriramappa
 **/
public class ProveStringImmutable {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1;
        System.out.println("Before changing s1");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("After changing s1");
        s1 = "Hello";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}
