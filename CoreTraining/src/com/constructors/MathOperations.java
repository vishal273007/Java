package com.constructors;

public class MathOperations {

	// Method to multiply input by 3 and return the result
	int calculate(int x) {
		System.out.println("Inside calculate: " + x); // Prints the input value
		return x * 3; // Returns the input multiplied by 3
	}

	// Method to add two numbers and return the result
	int compute(int a, int b) {
		System.out.println("Inside Compute: " + a + "" + b); // Prints both inputs
		return a + b; // Returns the sum of a and b
	}

	// Method to subtract the second number from the first and return the result
	int process(int m, int n) {
		System.out.println("Inside process: " + m + "," + n); // Prints the inputs
		return m - n; // Returns the result of m minus n
	}

	// Method to perform multiplication of the first two numbers and add the third
	int analyze(int p, int q, int r) {
		System.out.println("Inside analyze: " + p + "," + q + "," + r); // Prints all inputs
		return p * q + r; // Returns the result of (p * q) + r
	}

	// Method to divide the input by 2 and return the result
	int evaluate(int x) {
		System.out.println("Inside evaluate: " + x); // Prints the input
		return x / 2; // Returns the input divided by 2
	}

	// Constructor with no parameters - prints the number 10
	MathOperations() {
		System.out.println(10);
	}

	// Constructor with an integer and a string parameter - prints both
	MathOperations(int a, String s) {
		System.out.println(a); // Prints the integer input
		System.out.println(s); // Prints the string input
	}

	// Constructor with a string and an integer parameter - prints the string and a calculation
	MathOperations(String s, int x) {
		System.out.println(s); // Prints the string input
		System.out.println((x * 2) + 100); // Prints the result of (x * 2) + 100
	}

	// Main method demonstrating the usage of constructors and method calls
	public static void main(String[] args) {
		// A complex expression involving method calls and constructor usage
		// - evaluate() divides 6 by 2
		// - new ClassCons3("hi", 20) calls the constructor and analyze() uses the result of evaluate() 
		// - process() with 8 and 4, compute() with 10 and the result of previous method calls
		// - calculate() multiplies the final result by 3
		int result = new MathOperations().calculate(
				new MathOperations(new MathOperations().evaluate(6), "hi").compute(10, new MathOperations().process(8, 4))
						+ new MathOperations("hi", 20).analyze(5, 3, new MathOperations().evaluate(6)));

		// Prints the final result after all the calculations
		System.out.println("Final Result: " + result);
	}
}
