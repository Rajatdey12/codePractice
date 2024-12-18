package test.leetCode;

/*Given a string s, return the longest palindromic substring in s.

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
        Example 2:

Input: s = "cbbd"
Output: "bb"
*/

public class Leet5 {

    public static void main(String[] args) {
        longestPalindrome("babad");
        longestPalindrome("cbbd");
    }

    public static String longestPalindrome(String s) {

        if (s == null) return null;
        if (s.length() == 1) return s;

        String longest = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            String palindrome = helper(s, i, i);
            if (isLonger(longest, palindrome)) {
                longest = palindrome;
            }
            palindrome = helper(s, i, i + 1);
            if (isLonger(longest, palindrome)) {
                longest = palindrome;
            }
        }
        System.out.println(longest);
        return longest;
    }

    private static boolean isLonger(String longest, String palindrome) {
        return palindrome.length() > longest.length();
    }

    private static String helper(String s, int left, int right) {
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
