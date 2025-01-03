package com.constructors;

public class ConstructorChainingDemo {
	public void meth1() {
		System.out.println("Meth1() called");
	}

	// Non-parameterized constructor calling parameterized constructor
	public ConstructorChainingDemo() {
		new ConstructorChainingDemo(500).meth1();
		System.out.println("Non Parameterized method called");
		new ConstructorChainingDemo(100);
	}

	// Parameterized constructor
	public ConstructorChainingDemo(int a) {
		System.out.println("Parameterized method called: " + a);
	}

	public static void main(String[] args) {
		System.out.println("Start");
		ConstructorChainingDemo aobj = new ConstructorChainingDemo();
		aobj.meth1(); // Calls meth1() from the object created
		System.out.println("End");
	}
}
