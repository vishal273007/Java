package com.constructors;

public class ConstructorFlow {

	// Default constructor
	public ConstructorFlow() {
		System.out.println("Sunday"); // Prints "Sunday"

		// Creates an object using the constructor that accepts an integer and calls it
		ConstructorFlow aobj = new ConstructorFlow(10);
		System.out.println("Tuesday"); // Prints "Tuesday"

		// Calls the display method, which returns a string
		String s = aobj.display("Challenge Accepted");
		System.out.println(s); // Prints the returned string: "Challenge Accepted"
	}

	// Constructor that accepts an integer parameter
	public ConstructorFlow(int temp) {
		System.out.println("Saturday"); // Prints "Saturday"

		// Creates an object using the constructor that accepts two integers
		ConstructorFlow aobj = new ConstructorFlow(10, 20);

		// Adds the return value of meth1() and the input 'temp'
		int a = aobj.meth1() + temp;

		// Prints the sum of 'a' and the return value of meth2()
		System.out.println("===>" + (a + aobj.meth2()));
		System.out.println("Monday"); // Prints "Monday"
	}

	// Method to return the string value passed as an argument
	String display(String s) {
		System.out.println("In the next I am returning string value"); // Prints a message
		return s; // Returns the string passed as input
	}

	// Method that returns the integer 100
	int meth1() {
		return 100;
	}

	// Method that returns the integer 99
	int meth2() {
		return 99;
	}

	// Constructor that accepts two integer parameters
	public ConstructorFlow(int data, int temp) {
		System.out.println("Thursday"); // Prints "Thursday"

		// Performs a calculation and prints the result using meth2() from another constructor call
		System.out.println("===>" + (data + new ConstructorFlow("HI").meth2()));
	}

	// Constructor that accepts a string parameter
	ConstructorFlow(String s) {
		System.out.println(s); // Prints the string passed to the constructor
	}

	// Main method to demonstrate the use of constructors and method calls
	public static void main(String[] args) {
		// Creates an object using the default constructor
		ConstructorFlow aobj = new ConstructorFlow();

		// Prints "Output Verified" after all the constructor calls and methods are executed
		System.out.println("Output Verified");
	}
}
