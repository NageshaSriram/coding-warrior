package org.coding.codingwarrior.strings;

import java.util.Arrays;

/**
 * @author nageshasriramappa
 **/
public class FindTheDifference {
    static void main(String[] args) {
//        System.out.println(findTheDifference("", "y"));
        System.out.println(findTheDifference_V1("abcd", "abced"));
    }

    public static char findTheDifference_V1(String s,  String t) {
        int total = 0;
        for (int i=0; i<t.length(); i++) {
            total += t.charAt(i);
        }

        for (int i=0;i<s.length();i++) {
            total -= s.charAt(i);
        }

        return (char)total;
    }

    public static String findTheDifference(String s,  String t) {
        if (s.isEmpty()) {
            return t;
        }
        String[] sArr = s.split("");
        String[] tArr = t.split("");
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return t.substring(sArr.length, tArr.length);
    }
}
