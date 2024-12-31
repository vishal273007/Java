package com.oopsconcept.polymorphism;

// Class demonstrating method overloading (Compile-time Polymorphism)
public class MethodOverloadingEx01 {

	// Private static method with no arguments
	private static void meth1() {
		System.out.println(10);
	}

	// Static method with one integer argument
	static int meth1(int i) {
		System.out.println(20);
		return i;
	}

	// Public method with one string argument
	public void meth1(String s) {
		System.out.println(30);
	}

	// Default access method with an integer and a string argument
	void meth1(int i, String s) {
		System.out.println(40);
	}

	// Protected static method with a string and an integer argument
	static protected String meth1(String s, int i) {
		System.out.println(50);
		return s;
	}

	// Method with a StringBuffer argument
	StringBuffer meth1(StringBuffer sb) {
		System.out.println(60);
		return sb;
	}

	// Private method with a byte argument
	private void meth1(byte b) {
		System.out.println(70);
	}

	// Main method to test overloaded methods
	public static void main(String[] args) {
		MethodOverloadingEx01 obj = new MethodOverloadingEx01();

		// Calling different overloaded methods
		obj.meth1(); // Error: Cannot access private method outside the class
		obj.meth1(100); // Calls static int meth1(int)
		obj.meth1("vishal"); // Calls public void meth1(String)
		obj.meth1(100, "vishal"); // Calls default void meth1(int, String)
		obj.meth1("vishal", 100); // Calls static protected String meth1(String, int)
		obj.meth1(new StringBuffer("StringBuffer")); // Calls StringBuffer meth1(StringBuffer)
		obj.meth1((byte) 100); // Error: Cannot access private method outside the class

		// Demonstrating method overloading in main method
		main(); // Calls overloaded main without arguments
		main("I am learning javascript"); // Calls overloaded main with string argument
	}

	// Overloaded main method without arguments
	public static void main() {
		System.out.println("This is first main()");
	}

	// Overloaded main method with string argument
	public static void main(String s) {
		System.out.println("This is the second main()");
	}

	// Constructor demonstrating constructor overloading
	MethodOverloadingEx01() {
		this(100); // Calls parameterized constructor
		System.out.println("Default Constructor");
	}

	MethodOverloadingEx01(int x) {
		System.out.println("This is parameterized constructor: " + x);
	}
}
