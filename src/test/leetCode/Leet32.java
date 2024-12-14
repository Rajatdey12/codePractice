package test.leetCode;

import java.util.Stack;

/*Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses
substring
        .



        Example 1:

Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".
Example 2:

Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".
Example 3:

Input: s = ""
Output: 0*/
public class Leet32 {

    public static int longestValidParentheses(String s) {
        int max = 0;
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')  stk.push(i);
            else stk.pop();
            if (stk.empty()) stk.push(i);
            else max = Math.max(max, i - stk.lastElement());
        }
        System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
         longestValidParentheses("(()");
         longestValidParentheses(")()())");
    }
}
