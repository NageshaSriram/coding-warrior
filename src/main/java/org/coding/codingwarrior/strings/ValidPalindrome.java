package org.coding.codingwarrior.strings;

/**
 * @author nageshasriramappa
 **/
public class ValidPalindrome {

    static void main(String[] args) {
        String input = "2A man, a plan, a canal: Panama2";
        System.out.println(isValidPalindrome(input));
    }

    public static boolean isValidPalindrome(String input) {
        input = input.toLowerCase();
        StringBuilder onlyAlpha = new StringBuilder();
//        for (int i=0; i<input.length(); i++) {
//            Character character = input.charAt(i);
//            if (Character.isAlphabetic(character)) {
//                onlyAlpha.append(character);
//            }
//        }
        input = input.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        return isPalindrome(input);
    }

    public static boolean isPalindrome(String input) {
        int left = 0, right = input.length() - 1;
        while (left <= right) {
            if (input.charAt(left) == input.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
