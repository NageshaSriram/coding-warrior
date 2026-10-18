package org.coding.codingwarrior.common;

/**
 * @author nageshasriramappa
 **/

@FunctionalInterface
interface StringTransformer {
    String transfer(String str);

    default void display(String str) {
        System.out.println(str);
    }
}

@FunctionalInterface
interface SumIt {
    Integer add(Integer a, Integer b);
}

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        StringTransformer stringTransformer = String::toUpperCase;

        String aa = stringTransformer.transfer("hello");

        stringTransformer.display(aa);

        SumIt cc = (a,  b) -> a+b;

        System.out.println(cc.add(10, 20));
    }

}
