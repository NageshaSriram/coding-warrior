package org.coding.codingwarrior.strings;

import java.util.Arrays;

/**
 * @author nageshasriramappa
 **/
public class ReverseVowels {
    static void main(String[] args) {
        System.out.println(reverseVowels("vowel"));
    }

    static boolean isVowel(char c) {
        return "aeiou".contains(String.valueOf(c).toLowerCase());
    }

    static String reverseVowels(String input) {
        int left = 0, right = input.length() - 1;
        char[] inputArr = input.toCharArray();
        while (left < right) {
            while (!isVowel(inputArr[left])) {
                left++;
            }
            while (!isVowel(inputArr[right])) {
                right--;
            }
            if (left < right) {
                char temp = inputArr[left];
                inputArr[left] = inputArr[right];
                inputArr[right] = temp;
            }
            left++;
            right--;
        }
        return String.valueOf(inputArr);
    }
}
