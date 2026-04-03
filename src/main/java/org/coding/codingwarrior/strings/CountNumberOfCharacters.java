package org.coding.codingwarrior.strings;

/**
 * @author nageshasriramappa
 **/
public class CountNumberOfCharacters {
    static void main(String[] args) {
        String input = "Java is a programming language";

        int count = 0;

        for (int i=0; i< input.length(); i++) {
            if (input.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println(input+ ": " + count);
    }
}
