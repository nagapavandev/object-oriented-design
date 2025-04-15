package org.oops.java;

/**
 * Polymorphism is the ability of an object, method, or function to take
 * multiple forms. It allows the same method or operator to behave differently
 * based on the context.
 * 
 * Method overloading
 */
public class CompileTimePolymorphism {
	private static class MathOperations {
		// Method with two parameters
		public int add(int a, int b) {
			return a + b;
		}

		// Overloaded method with three parameters
		public int add(int a, int b, int c) {
			return a + b + c;
		}
	}

	public static void main(String[] args) {
		MathOperations math = new MathOperations();
		System.out.println("Sum (2 numbers): " + math.add(10, 20));
		System.out.println("Sum (3 numbers): " + math.add(10, 20, 30));
	}

}
