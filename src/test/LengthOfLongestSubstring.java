package test;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {

       /* Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.*/
        longestSubsWithoutRepeatingCharacters("abcabcbb");
    }

    public static int longestSubsWithoutRepeatingCharacters(String s) {
        int n = s.length();
        // Result
        int res = 0;
        for(int i = 0; i < n; i++)
            for(int j = i; j < n; j++)
                if (areDistinct(s, i, j))
                    res = Math.max(res, j - i + 1);
        System.out.println(res);
        return res;
    }

    public static Boolean areDistinct(String str,
                                      int i, int j) {
        // Note : Default values in visited are false
        boolean[] visited = new boolean[26];
        for(int k = i; k <= j; k++) {
            if (visited[str.charAt(k) - 'a'] == true)
                return false;

            visited[str.charAt(k) - 'a'] = true;
        }
        return true;
    }
}
