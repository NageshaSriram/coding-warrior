package org.coding.codingwarrior.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author nageshasriramappa
 **/
public class CountChars {
    public static void main(String[] args) {
        String name = "TejaswiniNageshaVikram";
        Map<Character, Integer> res = getCharCount(name);
        System.out.println(res);
    }

    static Map<Character, Integer> getCharCount(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c: input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
