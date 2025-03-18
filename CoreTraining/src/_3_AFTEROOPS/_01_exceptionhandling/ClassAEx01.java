// java program for explaining the exception handling. It's the first program on 04-Jan-2025

package _3_AFTEROOPS._01_exceptionhandling;

//Importing the Scanner class to take input from the user.
import java.util.Scanner;

//Defining a class named ClassA.
public class ClassAEx01 {

	// Creating a Scanner object to read input from the console.
	Scanner sc = new Scanner(System.in);

	// Defining a method named meth1.
	void meth1() {
		// Printing the number 10 to the console.
		System.out.println(10);

		// Starting a try block to handle any errors (exceptions) that may occur.
		try {
			// Printing a message indicating the try block is running.
			System.out.println("Try Block executed");

			// Asking the user to enter a number.
			System.out.println("Enter a number: ");

			// Performing division by the user-entered number and printing the result.
			System.out.println("==>" + 20 / sc.nextInt());
		}
		// If an error occurs, the catch block runs.
		catch (Exception e) {
			// Printing a message indicating the catch block is executed.
			System.out.println("Catch block executed");

			// Printing the error information.
			// System.out.println(e.toString()); // Prints the full exception description.
			// System.out.println(e.getMessage()); // Prints the error message.
			e.printStackTrace();// Prints where the error occurred (stack trace).
		}
		// The finally block always executes, whether an error occurs or not.
		finally {
			// Printing a message indicating the finally block is executed.
			System.out.println("Finally block executed");
		}
	}

	// Main method: Program execution starts here.
	public static void main(String[] args) {
		// Creating an object of ClassA and calling the meth1 method.
		new ClassAEx01().meth1();
	}
}
