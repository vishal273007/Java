package com.oopsconcept.abstraction;

// Abstract class ClassA, cannot be instantiated directly
public abstract class ClassA {

	// Abstract method meth1() - Must be implemented by subclass
	public abstract void meth1();

	// Abstract method msg(String x) - Must be implemented by subclass
	abstract String msg(String x);

	// Regular method meth2() - Can be used as-is by subclasses
	void meth2() {
		System.out.println("ClassA meth2() called");
	}

	// Static method meth3() - Can be called directly on the class, no object needed
	static void meth3() {
		System.out.println("ClassA meth3() called");
	}

	// Constructor - Called when an object of ClassA or its subclass is created
	ClassA() {
		System.out.println("ClassA default constructor called");
	}

	// Main method - Entry point of the program
	public static void main(String[] args) {
		System.out.println("ClassA main() method");
		// Cannot instantiate an abstract class: ClassA aobj = new ClassA();  // Compile-time error
		ClassA.meth3(); // Calling static method without creating an object
	}
}
