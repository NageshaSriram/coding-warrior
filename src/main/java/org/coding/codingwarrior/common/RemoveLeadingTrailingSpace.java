package org.coding.codingwarrior.common;

/**
 * @author nageshasriramappa
 **/
public class RemoveLeadingTrailingSpace {

    public static void main(String[] args) {
        String input = "  hello hh ";
        System.out.println(input.length());
        System.out.println(input.strip().length());
        System.out.println(input.trim().length());
    }


}
