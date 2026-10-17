package org.coding.codingwarrior.common;

import javax.print.DocFlavor;
import java.math.BigDecimal;

/**
 * @author nageshasriramappa
 **/

class Animal {
    private String name;
    BigDecimal weight;

    void type() {
        System.out.println("Animal");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meo");
    }
}
public class ExtendShowCase {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.type();
        cat.sound();
    }
}
