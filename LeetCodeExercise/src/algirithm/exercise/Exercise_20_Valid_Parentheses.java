package algirithm.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.
 * <p>
 * An input string is valid if:Open brackets must be closed by the same type of brackets. Or Open brackets must be closed in the correct order.
 * <p>
 * 	Example :<p>
	Input : "()" 
	Output : true<p>
	
	Input : "([)]"
	Output : false
 * 
 * @author aochishu
 * @since 2019/05/22
 * 
 * 
 */
public class Exercise_20_Valid_Parentheses {

	/*
	 * 解题思路 使用数据结构Stack
	 */
	public boolean isValid(String s) {
		Stack<Character> charStack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			switch (c) {
			case '{':
			case '[':
			case '(':
				charStack.push(c);
				break;
			case '}':
				if (charStack.empty()) {
					return false;
				} else {
					if (charStack.peek().equals('{')) {
						charStack.pop();
					} else {
						return false;
					}
				}
				break;
			case ']':
				if (charStack.empty()) {
					return false;
				} else {
					if (charStack.peek().equals('[')) {
						charStack.pop();
					} else {
						return false;
					}
				}
				break;
			case ')':
				if (charStack.empty()) {
					return false;
				} else {
					if (charStack.peek().equals('(')) {
						charStack.pop();
					} else {
						return false;
					}
				}
				break;

			}
		}
		return charStack.empty() ? true : false;
	}

	/*
	 * 使用HashMap简介代码
	 */
	public boolean isValid2(String s) {
		Map<Character, Character> parenthesesPairs = new HashMap<Character, Character>();
		parenthesesPairs.put('}', '{');
		parenthesesPairs.put(']', '[');
		parenthesesPairs.put(')', '(');

		Stack<Character> charStack = new Stack<Character>();

		for (char c : s.toCharArray()) {
			if (parenthesesPairs.containsValue(c)) {
				charStack.push(c);
			} else {
				char p = parenthesesPairs.get(c);
				if (charStack.empty()) {
					return false;
				} else {
					if (charStack.peek().equals(p)) {
						charStack.pop();
					} else {
						return false;
					}
				}
			}
		}

		return charStack.empty() ? true : false;
	}

}
