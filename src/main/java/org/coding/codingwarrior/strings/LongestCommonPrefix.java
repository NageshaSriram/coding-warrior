package org.coding.codingwarrior.strings;

import java.util.Arrays;

/**
 * @author nageshasriramappa
 **/
public class LongestCommonPrefix {

    static void main(String[] args) {

        String[] input = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix_v1(input));
    }

    public static String longestCommonPrefix_v1(String[] input) {
        Arrays.sort(input);
        String firstWord = input[0], lastWord = input[input.length - 1];
        int index = 0;
        while(index < firstWord.length()) {
            if (firstWord.charAt(index) == lastWord.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return index == 0 ? "" : firstWord.substring(0, index);
    }

    public static String longestCommonPrefix(String[] input) {
        StringBuilder res = new StringBuilder();
        String firstWord = input[0];
        for (int i=0;i<firstWord.length();i++) {
            boolean sameChar = true;
            for (String s: input) {
                if (s.charAt(i) != firstWord.charAt(i)) {
                    sameChar = false;
                    break;
                }
            }
            if (sameChar) {
                res.append(firstWord.charAt(i));
            } else {
                break;
            }
        }
        return res.toString();
    }
}
