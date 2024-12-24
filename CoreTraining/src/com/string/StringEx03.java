//Java program to demonstrate the differences between String, StringBuffer, and StringBuilder

package com.string;

public class StringEx03 {

	// Method to demonstrate the behavior of String, StringBuffer, and StringBuilder
	// during concatenation
	void meth1() {
		System.out.println("meth1() called"); // Notify when meth1() is called

		// Creating String, StringBuffer, and StringBuilder objects
		String s1 = new String("Java");
		StringBuffer buffer1 = new StringBuffer("Java");
		StringBuilder builder1 = new StringBuilder("Java");

		// Printing initial values before concatenation
		System.out.println(" --- Before Concatenation --- \n");
		System.out.println("s1: " + s1); // String value
		System.out.println("buffer1: " + buffer1); // StringBuffer value
		System.out.println("builder1: " + builder1); // StringBuilder value

		// Performing concatenation
		s1.concat(" is awesome"); // Strings are immutable, so this won't modify s1
		buffer1.append(" is awesome"); // Appends to StringBuffer
		builder1.append(" is awesome"); // Appends to StringBuilder

		// Printing values after concatenation
		System.out.println("--- After Concatenation ---\n");
		System.out.println("s1 : " + s1); // s1 remains unchanged
		System.out.println("buffer1 : " + buffer1); // buffer1 is modified
		System.out.println("builder1 : " + builder1); // builder1 is modified
	}

	// Method to demonstrate equals() and comparison of String, StringBuffer, and
	// StringBuilder
	void meth2() {
		System.out.println("meth2() called"); // Notify when meth2() is called

		// Creating String, StringBuffer, and StringBuilder objects
		String s1 = new String("Java");
		StringBuffer buffer1 = new StringBuffer();
		StringBuilder builder1 = new StringBuilder();

		// Creating additional objects for comparison
		String s2 = new String("Java");
		StringBuffer buffer2 = new StringBuffer();
		StringBuilder builder2 = new StringBuilder();

		// Using equals() to compare objects
		System.out.println("\n--- Using equals() ---");
		System.out.println(s1.equals(s2)); // Compares content of Strings (true)
		System.out.println(buffer1.equals(buffer2)); // Compares references of StringBuffers (false)
		System.out.println(builder1.equals(builder2)); // Compares references of StringBuilders (false)

		// Using == to compare memory references
		System.out.println("\n--- Using == ---");
		System.out.println(s1 == s2); // Compares references of Strings (false)
		System.out.println(buffer1 == buffer2); // Compares references of StringBuffers (false)
		System.out.println(builder1 == builder2); // Compares references of StringBuilders (false)

		// Comparing content of StringBuffer and StringBuilder using toString()
		System.out.println("\n--- Comparing content with toString() ---");
		System.out.println(buffer1.toString().equals(buffer2.toString())); // Compares content (true)
		System.out.println(builder1.toString().equals(builder2.toString())); // Compares content (true)

		// Modifying content of builder1
		builder1.append(" is awesome");
		System.out.println(builder1.toString().equals(builder2.toString())); // Compares content after modification
																				// (false)
	}

	// Method to demonstrate capacity and length behavior in StringBuffer
	void meth3() {
		System.out.println("meth3() called"); // Notify when meth3() is called

		StringBuffer sb = new StringBuffer(); // Creating a new StringBuffer
		System.out.println("Capacity: " + sb.capacity()); // Default capacity is 16
		sb.append("abcdefghijklmnopq"); // Adding characters to StringBuffer
		System.out.println("length(): " + sb.length()); // Length of the content
		System.out.println("Capacity(): " + sb.capacity()); // Capacity after appending (doubles when exceeded)
		System.out.println("sb: " + sb); // Printing the content of StringBuffer
	}

	// Main method to execute the program
	public static void main(String[] args) {
		StringEx03 aobj = new StringEx03(); // Creating an object of ClassA

		aobj.meth1(); // Calling meth1()

		System.out.println("--------------------------------");

		aobj.meth2(); // Calling meth2()

		System.out.println("--------------------------------");

		aobj.meth3(); // Calling meth3()
	}
}
