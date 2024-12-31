package com.oopsconcept.polymorphism;

// Child class to demonstrate Method Overriding
public class MethodOverridingClassB extends MethodOverridingClassA {

	// Overriding meth1() from parent class with public access modifier
	@Override
	public void meth1() { // Overridden
		System.out.println(10);
	}

	// Overriding meth2() with the same parameter and return type
	@Override
	public int meth2(int num) { // Overridden
		System.out.println(20);
		return 99;
	}

	// Overriding meth3() with the same parameter types
	@Override
	void meth3(int i, String s) { // Overridden
		System.out.println(30);
	}

	// @Override: ErrorStatic method cannot be overridden, but this hides the parent class method
	static void meth4() { // Hidden, not overridden
		System.out.println(40);
	}

	// Overriding meth5() with covariant return type
	@Override
	MethodOverridingClassB meth5() { // Overridden with covariant return type
		System.out.println(50);
		return new MethodOverridingClassB();
	}

	public static void main(String[] args) {
		// Parent class reference with parent class object
		MethodOverridingClassA aobj1 = new MethodOverridingClassA();
		aobj1.meth1(); // Calls parent class method

		System.out.println("---------------------------------------");

		// Parent class reference with child class object (runtime polymorphism)
		MethodOverridingClassA aobj2 = new MethodOverridingClassB();
		aobj2.meth1(); // Calls overridden method in child class
		aobj2.meth2(500); // Calls overridden method in child class
		aobj2.meth3(100, "Java"); // Calls overridden method in child class
		aobj2.meth4(); // Calls parent class static method (method hiding)
		aobj2.meth5(); // Calls overridden method in child class

		System.out.println("---------------------------------------");

		// Directly accessing static method from child class
		MethodOverridingClassB.meth4(); // Calls hidden method in child class
	}
}
