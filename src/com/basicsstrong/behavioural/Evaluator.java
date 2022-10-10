package com.basicsstrong.behavioural;

import java.util.Stack;

public class Evaluator {
	public Expression parse(String text) {
		//setting an expression
		Stack<Expression> stack = new Stack<Expression>();
		
		//parsing the text
		String[] words = text.split(" ");
		for(String word : words) {
			Expression lhs = null;
			Expression rhs = null;
			
			switch(word) {
			case "+":
				rhs = stack.pop();
				lhs = stack.pop();
				stack.push(new Add(lhs, rhs));
				break;
			case "-":
				rhs = stack.pop();
				lhs = stack.pop();
				stack.push(new Subtract(lhs, rhs));
				break;
			case "*":
			rhs = stack.pop();
			lhs = stack.pop();
			stack.push(new Multiply(lhs, rhs));
			break;
			case "/":
			rhs = stack.pop();
			lhs = stack.pop();
			stack.push(new Divide(lhs, rhs));
			break;
			default:
				int number = Integer.parseInt(word);
				stack.push(new Number(number));
				break;
			}
		}
		return stack.pop();
	}

}
