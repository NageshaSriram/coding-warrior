package org.coding.codingwarrior.common;

/**
 * @author nageshasriramappa
 **/
public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverse("Mass"));
        System.out.println(reverseV1("Vicky"));
    }

    private static String reverse(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        return stringBuilder.reverse().toString();
    }

    private static String reverseV1(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Null is not a valid input");
        }

        StringBuilder output = new StringBuilder();

        char[] chars = input.toCharArray();

        for (int i=chars.length-1; i>=0; i--) {
            output.append(chars[i]);
        }
        return output.toString();
    }
}
