package org.coding.codingwarrior.strings;

/**
 * @author nageshasriramappa
 **/
public class CheckPalindrome {
    static void main(String[] args) {
        System.out.println(checkPalindrome("LeVel"));
    }

    static boolean checkPalindrome(String input) {
        String res = "";
        for (int i = input.length() - 1; i >=0; i--) {
            res += input.charAt(i);
        }

        if (input.equalsIgnoreCase(res)) {
            return true;
        }

        return false;
    }
}
