package com.oopsconcept.polymorphism;

// Parent class to demonstrate Method Overriding
public class MethodOverridingClassA {

	// Method 1: Can be overridden in child class
	void meth1() { // Overridden in subclass
		System.out.println("ClassA meth1() Called");
	}

	// Method 2: Can be overridden with the same or wider access modifier
	protected int meth2(int i) { // Overridden in subclass
		System.out.println("ClassA meth2() called");
		return 100; // Returns an integer value
	}

	// Method 3: Can be overridden with the same parameter types
	void meth3(int i, String s) { // Overridden in subclass
		System.out.println("ClassA meth3() called");
	}

	// Method 4: Static method cannot be overridden but can be hidden
	static void meth4() { // Hidden in subclass
		System.out.println("ClassA meth4() called");
	}

	// Method 5: Demonstrates covariant return type (returning the same or subclass type)
	MethodOverridingClassA meth5() { // Overridden in subclass
		System.out.println("ClassA meth5() called");
		return new MethodOverridingClassA(); // Returns parent class object
	}

}
