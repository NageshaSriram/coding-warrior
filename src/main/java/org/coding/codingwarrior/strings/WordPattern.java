package org.coding.codingwarrior.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author nageshasriramappa
 **/
public class WordPattern {

    static void main(String[] args) {
        String word = "abba";
        String sentence = "dog, cat, cat, dog,";
        System.out.println(isFollowsWordPattern(word, sentence));
    }

    static boolean isFollowsWordPattern(String word, String sentence) {
        Map<String, String> reservedWords = new HashMap<>();
        String[] words = sentence.split(" +");
        if (words.length == word.length()) {
            for (int i=0;i<words.length;i++) {
                if (!reservedWords.containsKey(String.valueOf(word.charAt(i)))) {
                    reservedWords.put(String.valueOf(word.charAt(i)), words[i]);
                } else if (!Objects.equals(reservedWords.get(String.valueOf(word.charAt(i))), words[i])) {
                    return false;
                }
            }
        } else {
            return false;
        }

        return true;
    }

//    public  static boolean isFollowsWordPattern(String pattern, String s) {
//        String[] arr = s.split(" ");
//        if (pattern.length() != arr.length) {
//            return false;
//        }
//        HashMap<Character, String> hashMap = new HashMap<>();
//        for (int i=0; i<pattern.length(); i++) {
//            char ch = pattern.charAt(i);
//            boolean containsKey = hashMap.containsKey(ch);
//            if(hashMap.containsValue(arr[i]) && !containsKey) {
//                return false;
//            }
//            if(containsKey && !hashMap.get(ch).equals(arr[i])) {
//                return false;
//            } else {
//                hashMap.put(ch, arr[i]);
//            }
//        }
//        return true;
//    }
}
