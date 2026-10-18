package org.coding.codingwarrior.common;

/**
 * @author nageshasriramappa
 **/

class SampleOne {
    void printName() {
        System.out.println("Hello world!");
    }
}

class SampleTwo extends SampleOne {
    SampleTwo() {
        super();
        System.out.println("Helo");
    }

    @Override
    void printName() {
        super.printName();
    }
}
public class OverridingExample {

    public static void main(String[] args) {
        SampleTwo nn = new SampleTwo();
        nn.printName();
    }

}
