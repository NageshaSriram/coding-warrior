package org.coding.codingwarrior.strings;

/**
 * @author nageshasriramappa
 **/
public class FindIndexOfFirstOccurrenceInAString {
    static void main(String[] args) {
        System.out.println(findIndexOfFirstOccurrenceOfAString("SaaButSad", "Sad"));
//        System.out.println("SadButSad".substring(2, 5));
    }

    // "SadButSad" "Sad"

    static int findIndexOfFirstOccurrenceOfAString(String str1, String str2) {
        for (int i = 0; i < (str1.length() - str2.length() + 1); i++) {
            if (str1.charAt(i) == str2.charAt(0) && (str1.substring(i, i + str2.length()).equals(str2))) {
                return i;
            }
        }
        return -1;
    }
}
