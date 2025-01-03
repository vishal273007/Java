// ClassA3 method without main().
package com.oopsconcept._01_inheritance;

// Parent class: ClassA3
public class ClassA3 {
	// Method to print a message
	void meth1() {
		System.out.println("Class A3 Method");
	}

	// Default constructor
	ClassA3() { // Called when object of ClassA3 or its child is created
		// Calls the parameterized constructor with 100 as argument
		this(100);
		// Calls the meth1() method
		this.meth1();
		// Prints a message indicating default constructor
		System.out.println("Class A3 default constructor.");
	}

	// Parameterized constructor
	ClassA3(int x) { // Called with value 999 in child class constructor
		System.out.println("ClassA3 parameterized constructor called: " + x);
	}
}
