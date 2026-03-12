package org.coding.codingwarrior.twopointer;

/**
 * @author nageshasriramappa
 **/
public class ValidatePalindrome {
    static void main() {
        String[] inputs = {
                "A man, a plan, a canal: Panama",
                "race a car",
                "1A@2!3 23!2@a1",
                "No 'x' in Nixon",
                "12321"
        };

        for (String input: inputs) {
            boolean isPalindrome = isValidPalindrome(input);
            System.out.println("Input :" + input);
            System.out.println("Is Palindrome :" + isPalindrome);
        }
    }

    static boolean isValidPalindrome(String input) {
        int left = 0, right = input.length() - 1;

        while (left < right) {
            while ((left < right) && !Character.isLetterOrDigit(input.charAt(left))) {
                left++;
            }

            while ((left < right) && !Character.isLetterOrDigit(input.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(input.charAt(left)) != Character.toLowerCase(input.charAt(right))) {
                return false;
            }
            left ++;
            right --;
        }

        return true;
    }


}
