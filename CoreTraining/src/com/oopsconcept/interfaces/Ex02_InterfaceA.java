package com.oopsconcept.interfaces;

// Defining an interface named Ex02_InterfaceA
public interface Ex02_InterfaceA {
	// Default method in the interface with a body
	default void meth1() {
		// This method prints a specific message
		System.out.println("InterfaceA meth1() called");
	}
}