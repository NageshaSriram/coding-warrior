package org.coding.codingwarrior.common;

import java.util.*;

/**
 * @author nageshasriramappa
 **/
public class SortHashMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alex", 86);
        map.put("Tej", 99);
        map.put("Nag", 98);
        map.put("Vikram", 95);
        System.out.println(map);
        Map<String, Integer> res = sortByValue(map);
        System.out.println(res);
    }

    static Map<String, Integer> sortByValue(Map<String, Integer> hashMap) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entrySet);

        entryList.sort((e1, e2) -> e1.getValue().compareTo(e2.getValue()));

        for (Map.Entry<String, Integer> entry: entryList) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }
}
