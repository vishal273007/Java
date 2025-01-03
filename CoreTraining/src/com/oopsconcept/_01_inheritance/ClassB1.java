package com.oopsconcept._01_inheritance;

public class ClassB1 extends ClassA1 {

	public void meth2() {
		System.out.println("Class B method");
	}

	public static void main(String[] args) {

		// Has-A relationship: Instance of ClassA, can only access methods in ClassA
		ClassA1 aobj1 = new ClassA1();
		aobj1.meth1();
		// aobj1.meth2(); // Error: meth2 is not defined in ClassA

		// Runtime Polymorphism: Reference of ClassA, object of ClassB
		ClassA1 aobj2 = new ClassB1();
		aobj2.meth1(); // Calls ClassA's meth1
		// aobj2.meth2(); // Error: ClassA reference can't access meth2 in ClassB

		// Is-A relationship: Instance of ClassB, can access both ClassA and ClassB
		// methods
		ClassB1 bobj1 = new ClassB1();
		bobj1.meth1();
		bobj1.meth2();

		// Invalid: ClassA object cannot be assigned to a ClassB reference
		// ClassB bobj = new ClassA(); // Compile-time error
	}
}
