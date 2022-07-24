package com.GreatLearning.Service;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {

	Deque<Character> stack = new ArrayDeque<Character>();

	public boolean areBracketsBalanced(String expr) {

		for (int i = 0; i < expr.length(); i++) {
			char x = expr.charAt(i);

			if (x == '(' || x == '{' || x == '[') {
				// pushing the opening braces onto the stack
				stack.push(x);
				continue;
			}

			// If it is the closing bracket case then the stack cannot be left empty
			// In that case we will pop the bracket and will see whether it matches the
			// opening bracket or not
			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}

		// finally checking whether the stack is empty or not
		return (stack.isEmpty());

	}

}
