// Java program in oops for inheritance. This is one class and it inherits from classB and ClassB from ClassA.

// Package declaration must be at the top
package inheritance_classx;

import com.oopsconcept._01_inheritance.ClassB;

// ClassX extends ClassB, inheriting methods from ClassA (through ClassB) and adding its own method
public class ClassX extends ClassB {

	public void meth3() {
		System.out.println("Class X Method");
	}

	public static void main(String[] args) {
		// Object of ClassX can access methods from ClassA, ClassB, and ClassX
		ClassX xobj = new ClassX();
		xobj.meth1(); // From ClassA (inherited by ClassB)
		xobj.meth2(); // From ClassB
		xobj.meth3(); // From ClassX
	}
}
