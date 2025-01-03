// Java program for inheritance. This is the child class b3 and its parent class is Class A3 in the same package.

package com.oopsconcept._01_inheritance;

// Child class: ClassB3 inherits from ClassA3
public class ClassB3 extends ClassA3 {

	// Method to display a message
	void msg() {
		System.out.println("ClassB msg() called.");
		super.meth1(); // Calls parent class meth1()
	}

	// Default constructor
	ClassB3() { // Called when an object of ClassB3 is created without arguments
		// super(); // Automatically calls parent class default constructor (even if not written)
		super.meth1(); // Calls parent class meth1() explicitly
		System.out.println("ClassB3 default Constructor.");
	}

	// Parameterized constructor
	ClassB3(int y) { // Called when an object of ClassB3 is created with an integer argument
		super(999); // Calls parent class parameterized constructor with 999
		System.out.println("ClassB parameterized Constructor called: " + y);
	}

	// Main method - program execution starts here
	public static void main(String[] args) {
		// Create an object using the default constructor
		ClassB3 bobj1 = new ClassB3();

		// Create an object using the parameterized constructor
		ClassB3 bobj2 = new ClassB3(1000);

		// Call the msg() method using the first object
		bobj1.msg();

		// super.meth1(); // Invalid! Cannot use 'super' in a static context like main().
	}
}

/*
 * ClassA3 parameterized constructor called. (error, i did not wrote 100 value).
 * ClassA3 Method ClassA3 default constructor
 * 
 * claaA3 method ClassB3 default constructor called. (error, I added 'added'
 * word)
 * 
 * ClassA3 parameterized constructor called: 999
 * classB3 parameterized
 * constructor called: 1000
 * 
 * ClassB3 msg() called ClassA3 method
 */