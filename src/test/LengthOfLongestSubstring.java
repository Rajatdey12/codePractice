package test;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {

        String[] inpArr = new String[] {"abcabcdbb", "TMMZUXT"};

       /* Input: s = "abcabcbb", "TMMZUXT"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.*/
        longestSubStrWithoutRepeatChars(inpArr[1]);
    }

    // HASHSET METHOD OR SLIDING WINDOW
    public static int longestSubStrWithoutRepeatChars(String s) {

            Set<Character> set = new HashSet<>();
            int maxLength=0;
            int left=0;
            for(int right=0;right<s.length();right++){

                if(!set.contains(s.charAt(right))){
                    set.add(s.charAt(right));
                    maxLength=Math.max(maxLength,right-left+1);

                }else{
                    while(s.charAt(left)!=s.charAt(right)){
                        set.remove(s.charAt(left));
                        left++;
                    }
                    left++;
                }
            }
            System.out.println(maxLength);
            return maxLength;
    }
}
