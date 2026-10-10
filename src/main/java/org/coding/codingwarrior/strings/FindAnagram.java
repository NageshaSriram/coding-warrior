package org.coding.codingwarrior.strings;

import java.util.Arrays;

/**
 * @author nageshasriramappa
 **/
public class FindAnagram {

    static void main(String[] args) {
        System.out.println(isAnagram("anagrams", "nagarams"));
        System.out.println(isAnagram_V1("anagramsa", "nagaramsq"));
    }

    static boolean isAnagram_V1(String s1, String s2) {

        int m = s1.length(), n = s2.length();
        if(m == n) {
            int[] count = new int[26];
            for (int i = 0; i < m; i++) {
                count[s1.charAt(i) - 'a']++;
            }
            for (int i = 0; i < m; i++) {
                count[s2.charAt(i) - 'a']--;
            }
            for (int i = 0; i < 26; i++) {
                if (count[i] != 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    static boolean isAnagram(String s1,  String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] s1Frequency = new int[26];
        int[] s2Frequency = new int[26];
        for (int i=0; i<s1.length(); i++) {
            s1Frequency[s1.charAt(i) - 'a'] = s1Frequency[s1.charAt(i)- 'a']+1;
        }

        for (int i=0; i<s2.length();i++) {
            s2Frequency[s2.charAt(i) - 'a'] = s2Frequency[s2.charAt(i)- 'a']+1;
        }

        boolean res = true;
        for (int i = 0; i<26;i++) {
            if (s1Frequency[i] != s2Frequency[i]) {
                res =  false;
                break;
            }
        }

        return res;

    }
}
