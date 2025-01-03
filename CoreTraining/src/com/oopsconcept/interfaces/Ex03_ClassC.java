package com.oopsconcept.interfaces;

public class Ex03_ClassC extends Ex03_ClassB {
	// Overriding meth1 from ClassB to print "ClassC"
	void meth1() {
		System.out.println("ClassC");
	}

	public static void main(String[] args) {
		// Creating an object of ClassB and calling meth1, which will print ClassB's message
		Ex03_ClassA aobj1 = new Ex03_ClassB();
		aobj1.meth1();

		// Creating an object of ClassC and calling meth1, which will print ClassC's message
		Ex03_ClassA aobj2 = new Ex03_ClassC();
		aobj2.meth1();
	}

}
