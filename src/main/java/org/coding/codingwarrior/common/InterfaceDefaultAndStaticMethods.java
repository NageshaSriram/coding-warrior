package org.coding.codingwarrior.common;

/**
 * @author nageshasriramappa
 **/

interface Interface1 {
    public void display();

    default void show() {
        System.out.println("Showing");
    }

    static void sound() {
        System.out.println("Make noise");
    }
}

class SampleClass implements Interface1 {

    @Override
    public void display() {
        Interface1.sound();
    }

    @Override
    public void show() {
//        Interface1.super.show();
    }
}
public class InterfaceDefaultAndStaticMethods {

    public static void main(String[] args) {

    }
}
