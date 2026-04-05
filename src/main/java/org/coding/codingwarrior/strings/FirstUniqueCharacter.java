package org.coding.codingwarrior.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nageshasriramappa
 **/
public class FirstUniqueCharacter {
    static void main(String[] args) {
        System.out.println(firstUniqueCharacter("loveleetcode"));
        System.out.println(getFirstUniqueCharacterUsingHashMap("loveleetcode"));
    }

    static int firstUniqueCharacter(String input) {
        int[] fre = new int[26];
        char[] chars = input.toCharArray();
        for (char c: chars) {
            fre[c - 'a']++;
        }

        for(int i=0; i< chars.length;i++) {
            if (fre[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    static int getFirstUniqueCharacterUsingHashMap(String input) {

        Map<Character, Integer> map = new HashMap<>();
        for (Character c: input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i=0; i< input.length(); i++) {
            if (map.get(input.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
