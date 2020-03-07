package com.bridgelabz.simple_balanced_parentheses;

import com.bridgelabz.utility.StackOperations;

public class BalancedParentheses{
	static boolean check(String strings) {
		StackOperations<Character> objStack = new StackOperations();
		for (int index = 0; index < strings.length(); index++) {
			/*
			* push open parenthesis “(“ and pop closed parenthesis “)”. At the end of the
			* expression if the Stack is empty then the arithmetic expression is balanced.
			*/
			char check = strings.charAt(index);
			if (check == '(')
				objStack.push(strings.charAt(index));
			else if (check == ')')
				objStack.pop();
		}
		return objStack.isEmpty();
	}
	public static void main(String[] args) {
		String expression = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		String result = (check(expression)) ? "Balanced" : "Not Balanced";
		System.out.println(result);
	}
}
