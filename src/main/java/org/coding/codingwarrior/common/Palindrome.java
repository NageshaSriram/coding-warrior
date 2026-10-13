package org.coding.codingwarrior.common;

import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;

/**
 * @author nageshasriramappa
 **/
public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("kaaka"));
        System.out.println(isPalindromeV1("kaaka"));
    }

    private static boolean isPalindrome(String input) {
        return input.contentEquals(new StringBuilder(input).reverse());
    }

    private static boolean isPalindromeV1(String input) {
        int left = 0, right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
