package org.coding.codingwarrior.common;

/**
 * @author nageshasriramappa
 **/
public class CheckVowel {

    public static void main(String[] args) {
        System.out.println(checkVowel("ntv"));
    }

    private static boolean checkVowel(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
