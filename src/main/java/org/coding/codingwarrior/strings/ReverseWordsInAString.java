package org.coding.codingwarrior.strings;

import java.util.Arrays;

/**
 * @author nageshasriramappa
 **/
public class ReverseWordsInAString {
    static void main(String[] args) {
        System.out.println(reverseWords("   The sky is   blue  "));
    }

    static String reverseWords(String input) {
        String[] strArr = input.split(" +");
        StringBuilder stringBuilder = new StringBuilder();
        for ( int i = strArr.length - 1; i >= 0; i-- ) {
            stringBuilder.append(strArr[i]);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
