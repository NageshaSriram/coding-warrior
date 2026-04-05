package org.coding.codingwarrior.strings;

import java.util.Arrays;

/**
 * @author nageshasriramappa
 **/
public class ReverseString {
    static void main(String[] args) {
        System.out.println(reverseString("Nagesh"));
    }

    static String reverseString(String input) {

        String result = "";
//        StringBuilder stringBuilder = new StringBuilder(input);
//        stringBuilder.append(10);
//        return stringBuilder.reverse().toString();

//        StringBuffer stringBuffer = new StringBuffer(input);
//        return stringBuffer.reverse().toString();

        int left = 0, right = input.length()-1;
        char[] charArr = input.toCharArray();
        while (left < right) {
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            left++;
            right--;
        }
        return new String(charArr);
    }
}
