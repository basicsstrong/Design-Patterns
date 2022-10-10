package com.basicsstrong.behavioural;

import java.util.Scanner;

public class InterpreterDesignPattern {

	public static void main(String[] args) {

		Evaluator eval = new Evaluator();
		System.out.println("Enter the Expression in Postfix notation :");
		 Scanner sc = new Scanner(System.in);
		 String expression = sc.nextLine();
		 sc.close();
		 System.out.println(eval.parse(expression).interpret());
		 
	}

}
