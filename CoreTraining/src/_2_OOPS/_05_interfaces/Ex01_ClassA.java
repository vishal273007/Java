package _2_OOPS._05_interfaces;

// ClassA extends ClassB and implements two interfaces: InterfaceA and InterfaceB
public class Ex01_ClassA extends Ex01_ClassB implements Ex01_InterfaceA, Ex01_InterfaceB {

	// Overriding the meth1() from InterfaceA
	@Override
	public void meth1() {
		System.out.println("InterfaceA abstract method overridden");
	}

	// Adding a new method greeting() specific to ClassA
	public void greeting() {
		System.out.println("Happy New Year 2025");
	}

	// Main method - Entry point of the program
	public static void main(String[] args) {
		// Creating an object of ClassA, referred by InterfaceA reference variable
		Ex01_InterfaceA aobj = new Ex01_ClassA();

		// Calling meth1() from InterfaceA, overridden in ClassA
		aobj.meth1();

		// Calling meth2() from InterfaceB (inherited by ClassA)
		aobj.meth2();

		// Uncommenting the next line would give a compile-time error:
		// aobj.meth4(); // private methods in interfaces are not visible outside the interface

		// Calling msg() method in ClassA
		new Ex01_ClassA().msg();
	}
}
