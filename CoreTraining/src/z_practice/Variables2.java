package z_practice;

public class Variables2 {

	// Instance variables
	int x = 10; // Instance variable 'x' initialized to 10
	static int y = 20; // Static variable 'y' initialized to 20
	boolean flag; // Instance variable 'flag', default value is false (boolean variables are false by default)
	static float f; // Static variable 'f', default value is 0.0f (float variables are 0.0 by default)

	// Method to demonstrate the usage of instance, static, and local variables
	void meth1() {
		int z = 30; // Local variable 'z' initialized to 30
		System.out.println("meth1() called");

		// Accessing and printing instance variable 'x' using current object
		System.out.println("Instance variable: " + x);

		// Creating a new object to demonstrate accessing 'x' through another instance
		System.out.println("Instance variable: " + new Variables2().x);

		// Accessing and printing static variable 'y'
		System.out.println("Static variable " + y);

		// Accessing static variable 'y' using a new object, still referring to the same class variable
		System.out.println("Static variable: " + new Variables2().y);

		// Accessing static variable 'y' using class name directly
		System.out.println("Static variable: " + Variables2.y + "\n");

		// Printing the local variable 'z' (this is only accessible within the meth1 method)
		System.out.println("Local variable: " + z);
	}

	// Method to demonstrate variable shadowing where local variables have the same name as instance/static variables
	void meth2() {
		int x = 111; // Local variable 'x' initialized to 111, shadows the instance variable 'x'
		int y = 222; // Local variable 'y' initialized to 222, shadows the static variable 'y'
		// Printing the instance variable 'x' using a new object
		System.out.println("Instance variable: " + new Variables2().x);

		// Printing the static variable 'y' using class name
		System.out.println("Static variable: " + Variables2.y);
	}

	// Method to demonstrate the default values of instance and static variables
	void meth3() {
		System.out.println("meth3() called");
		int num; // Declaring an uninitialized local variable 'num' (local variables need initialization before use)
		// Printing the default value of the instance variable 'flag' (which is false by default)
		System.out.println("Instance variable flag: " + flag);

		// Printing the default value of the static variable 'f' (which is 0.0f by default)
		System.out.println("Static variable f: " + f);
	}

	// Main method to run the program
	public static void main(String[] args) {
		Variables2 aobj = new Variables2(); // Creating an object of the Variables2 class
		aobj.meth1(); // Calling meth1() using the object
		aobj.meth2(); // Calling meth2() using the object
		aobj.meth3(); // Calling meth3() using the object
	}
}
