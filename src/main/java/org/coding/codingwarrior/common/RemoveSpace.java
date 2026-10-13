package org.coding.codingwarrior.common;

/**
 * @author nageshasriramappa
 **/
public class RemoveSpace {

    static void main(String[] args) {
        System.out.println(removeSpace("nag tej"));
    }

    private static String removeSpace(String input) {
        StringBuilder output = new StringBuilder();

        char[] chars = input.toCharArray();

        for (char c: chars) {
            if (!Character.isWhitespace(c)) {
                output.append(c);
            }
        }

        return output.toString();
    }
}
