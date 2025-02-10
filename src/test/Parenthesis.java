package test;

import java.util.Stack;

public class Parenthesis {

	/**
	 * solve for valid parenthesis
	 * Problem: Given a string containing just the characters
	 * '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
	 */

	private static boolean valid(String s) {

		Stack<Character> validStack = new Stack<>();
		for (Character ch : s.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				validStack.push(ch);
			} else {
				if (validStack.isEmpty()) return false;
				char topElem = validStack.pop();
				if ((ch == ')' && topElem != '(') || (ch == '}' && topElem != '{') || (ch == ']' && topElem != '[')) {
					return false;
				}
			}
		}
		return validStack.isEmpty();
	}

	public static void main(String[] args) {
		System.out.println("Is the pattern provided valid ? -> " + valid("{[()]}"));
		System.out.println("Is the pattern provided valid ? -> " + valid("{[({})]}"));
		System.out.println("Is the pattern provided valid ? -> " + valid("{[({})}"));
		System.out.println("Is the pattern provided valid ? -> " + valid("{[}]"));
	}
}
