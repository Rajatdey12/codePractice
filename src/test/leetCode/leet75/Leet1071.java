package test.leetCode.leet75;

/*
For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t
(i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""
 */
public class Leet1071 {

    public static void main(String[] args) {
        String s1 = "ABCABC";
        String s2 = "ABC";
        gcdOfStrings(s1, s2);
    }

    public static String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLen = gcdLen(str1.length(), str2.length());
        System.out.println(str1.substring(0, gcdLen));
        return str1.substring(0, gcdLen);
    }

    private static int gcdLen(int len1, int len2) {
        while (len2 != 0) {
            int temp = len1 % len2;
            len1 = len2;
            len2 = temp;
        }
        return len1;
    }
}
