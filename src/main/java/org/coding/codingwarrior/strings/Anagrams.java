package org.coding.codingwarrior.strings;

import java.util.Arrays;

/**
 * @author nageshasriramappa
 **/
public class Anagrams {

    static void main(String[] args) {
        String input1 = "keep", input2 = "peek";
        System.out.println(isAnagrams(input1, input2));
    }

    public static boolean isAnagrams(String input1, String input2) {
        if (input2.length() == input1.length()) {
            char[] inputArr1 = input1.toCharArray();
            char[] inputArr2 = input2.toCharArray();
            Arrays.sort(inputArr1);
            Arrays.sort(inputArr2);
            return Arrays.equals(inputArr1, inputArr2);
        }
        return false;
    }


}
