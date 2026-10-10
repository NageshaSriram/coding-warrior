package org.coding.codingwarrior.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nageshasriramappa
 **/
public class Isomorphic {
    static void main(String[] args) {
        System.out.println(isIsomorphic("foo", "baa"));
    }

    public static boolean isIsomorphic(String s, String t) {
        int m = s.length(), n = t.length();
        if (m == n) {
            Map<Character, Character> charMap= new HashMap<>();
            for (int i = 0; i<m; i++) {
                if (charMap.containsKey(s.charAt(i)) && charMap.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
                charMap.put(s.charAt(i), t.charAt(i));
            }
            return true;
        }
        return false;
    }
}
