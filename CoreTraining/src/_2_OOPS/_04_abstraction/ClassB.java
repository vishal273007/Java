package _2_OOPS._04_abstraction;

// ClassB extends ClassA and provides implementations for its abstract methods
public class ClassB extends ClassA {

	// Overriding the abstract method meth1() from ClassA
	@Override
	public void meth1() {
		System.out.println("ClassA abstract method overridden");
	}

	// Overriding the meth2() method from ClassA
	@Override
	public void meth2() {
		System.out.println("ClassA meth2() overridden");
	}

	// Overriding the msg(String s) method from ClassA
	@Override
	String msg(String s) {
		System.out.println("ClassA msg() overridden");
		return "Java is awesome"; // Returning a string
	}

	// Main method - Entry point of the program
	public static void main(String[] args) {
		// Creating an object of ClassB, referred by ClassA reference variable
		ClassA aobj = new ClassB();

		// Calling overridden methods using the ClassA reference
		aobj.meth1(); // Calls meth1() from ClassB
		aobj.meth2(); // Calls meth2() from ClassB
		System.out.println(aobj.msg("100")); // Calls msg() from ClassB and prints returned string
	}
}
