package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {

        String[] inpArr = new String[]{"abcabcdbb", "TMMZUXT"};

       /* Input: s = "abcabcbb"
        Output: 4
        Explanation: The answer is "abcd", with the length of 4.

        Input: s = "TMMZUXT"
        Output: 5
        Explanation: The answer is "MZUXT", with the length of 5.
        */

        longestSubStrWithoutRepeatChars(inpArr[0]);
    }

    // HASHSET METHOD OR SLIDING WINDOW
    public static int longestSubStrWithoutRepeatChars(String s) {

        Set<Character> lsSet = new HashSet<>(1);
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            if (!lsSet.contains(s.charAt(right))) {
                lsSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (s.charAt(left) != s.charAt(right)) {
                    lsSet.remove(s.charAt(left));
                    left++;
                }
                left++;
            }
        }
        System.out.println("Longest substring without repeating characters with maximum length is : " + maxLength);
        return maxLength;
    }
}
