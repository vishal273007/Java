package _3_AFTEROOPS._01_exceptionhandling;

import java.io.FileReader;
import java.util.Scanner;

public class ClassAEx02 {
	// Scanner object to take input from the user
	Scanner sc = new Scanner(System.in);

	// Method to demonstrate exception handling with try-catch-finally
	void meth1() {
		System.out.println(10);

		// Creating an array of Strings
		String names[] = new String[5];
		names[1] = "Sujatha";
		names[2] = "Cristine";
		try {
			// Try block to handle exceptions
			System.out.println("Try block executed");
			System.out.println("Enter a number: ");

			// Potential ArithmeticException (division by zero)
			System.out.println("==>" + 20 / sc.nextInt());

			// Potential NullPointerException (if names[2] is null)
			System.out.println("length: " + names[2].length());
			System.out.println("Hello World");
		}

		// Catch block to handle multiple exceptions (Arithmetic or NullPointer)
		catch (ArithmeticException | NullPointerException e) {
			System.out.println("catch block executed");
			e.printStackTrace(); // Prints detailed error information
		}

		// Finally block always executes (used for cleanup activities)
		finally {
			System.out.println("Finally block executed");
			sc.close(); // Closing the scanner object
		}

		System.out.println(30);
	}

	// Method to demonstrate handling checked exceptions (File Handling)
	void meth2() throws Exception {
		System.out.println("meth2() called");

		// Try-with-resources to automatically close resources (FileReader)
		try (FileReader fr = new FileReader("D:\\Classes\\03_Notes\\Quick Notes.txt")) {
			System.out.println("Connection created");
		}
	}

	// Main method to execute the program
	public static void main(String[] args) throws Exception {
		ClassAEx02 aobj = new ClassAEx02();
		// Uncomment below line to test meth1()
		aobj.meth1();

		// Testing meth2()
		// aobj.meth2();
	}
}
