// Code 3: Implementing both interfaces in a class
package com.oopsconcept.interfaces;

// Defining a class that implements both interfaces
public class Ex02_ClassA implements Ex02_InterfaceA, Ex02_InterfaceB {
	// Overriding the meth1() method to resolve conflict caused by same method name in both interfaces
	@Override
	public void meth1() {
		// Explicitly calling meth1() of InterfaceA using 'super'
		Ex02_InterfaceA.super.meth1();
		// Explicitly calling meth1() of InterfaceB using 'super'
		Ex02_InterfaceB.super.meth1();
	}

	// Main method to execute the program
	public static void main(String[] args) {
		// Creating an object of Ex02_ClassA
		Ex02_ClassA aobj = new Ex02_ClassA();
		// Calling meth1() to display outputs from both interfaces
		aobj.meth1();
	}
}