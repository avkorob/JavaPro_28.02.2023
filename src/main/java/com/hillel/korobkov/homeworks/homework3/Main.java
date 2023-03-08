package com.hillel.korobkov.homeworks.homework3;

import java.util.Map;
import java.util.HashMap;
//         Given two strings s and t, return true if t is an anagram of s, and false otherwise.

//        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
//        typically using all the original letters exactly once.
//          Example 1:
//
//        Input: s = "anagram", t = "nagaram"
//        Output: true
//        Example 2:
//
//        Input: s = "rat", t = "car"
//        Output: false

public class Main {

    public static boolean isAnagram(String str1, String str2) {

        if (str1 == null || str2 == null) {
            return false;
        }
        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : str1.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            if (!freq.containsKey(c)) {
                return false;
            }
            freq.put(c, freq.get(c) - 1);
            if (freq.get(c) == 0) {
                freq.remove(c);
            }
        }
        return freq.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "middle";
        String str2 = "midle";

        if (isAnagram(str1, str2)) {
            System.out.print("Anagram");
        } else {
            System.out.print("Not an Anagram");
        }
    }


}