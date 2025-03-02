package test;

import java.util.*;

public class FindAllAnagramsMap {
    public static List<Integer> findAnagrams(String str, String ptr) {
        List<Integer> result = new ArrayList<>();
        if (str.length() < ptr.length()) return result;
        Map<Character, Integer> patternFreq = new HashMap<>();
        Map<Character, Integer> windowFreq = new HashMap<>();
        int m = ptr.length();
        // Initialize frequency maps
        for (int i = 0; i < m; i++) {
            patternFreq.put(ptr.charAt(i), patternFreq.getOrDefault(ptr.charAt(i), 0) + 1);
            windowFreq.put(str.charAt(i), windowFreq.getOrDefault(str.charAt(i), 0) + 1);
        }
        if (patternFreq.equals(windowFreq)) result.add(0);
        for (int i = m; i < str.length(); i++) {
            char newChar = str.charAt(i);
            char oldChar = str.charAt(i - m);
            windowFreq.put(newChar, windowFreq.getOrDefault(newChar, 0) + 1);
            windowFreq.put(oldChar, windowFreq.get(oldChar) - 1);
            if (windowFreq.get(oldChar) == 0) {
                windowFreq.remove(oldChar);
            }
            if (patternFreq.equals(windowFreq)) {
                result.add(i - m + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "BACDGABCDA";
        String ptr = "ABCD";

        List<Integer> result = findAnagrams(str, ptr);
        System.out.println("Starting indices of anagrams: " + result);
    }
}
