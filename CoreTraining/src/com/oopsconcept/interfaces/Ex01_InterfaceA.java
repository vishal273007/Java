package com.oopsconcept.interfaces;

// Defining an interface InterfaceA
public interface Ex01_InterfaceA {

	// Interface variables are by default public, static, and final
	int i = 10; // 'public static final int i = 10' by default

	// Interface methods are by default public and abstract
	void meth1(); // 'public abstract void meth1();' by default

	// Default method in interface - can have a method body and can be overridden by implementing classes
	default void meth2() {
		System.out.println("InterfaceA default meth2()");
		this.meth4(); // Calling private method from the same interface using 'this'
	}

	// Static method in interface - Can be called using the interface name without an object
	static void meth3() {
		System.out.println("InterfaceA static method");
	}

	// Private method in interface - can only be called from within the interface
	private void meth4() {
		System.out.println("InterfaceA private method, called via 'this' keyword in meth2");
	}

	// Main method to test the interface methods
	public static void main(String[] args) {
		System.out.println("InterfaceA main method");
		Ex01_InterfaceA.meth3(); // Calling static method from the interface
	}
}
