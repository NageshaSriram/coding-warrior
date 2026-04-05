package org.coding.codingwarrior.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * @author nageshasriramappa
 **/
public class LengthOfLongestSubString {

    static void main(String[] args) {
        String input = "abccdbb";
        System.out.println(getLengthOfLongestSubString(input));
    }

    static int getLengthOfLongestSubString(String input) {
        int start = 0, end = 0, max_length = 0;
        Set<Character> set = new HashSet<>();
        while (end < input.length()) {
            if (!set.contains(input.charAt(end))) {
                set.add(input.charAt(end));
                max_length = Math.max(max_length, set.size());
                end++;
            } else {
                set.remove(input.charAt(start));
                start++;
            }
        }
        return max_length;
    }
}
