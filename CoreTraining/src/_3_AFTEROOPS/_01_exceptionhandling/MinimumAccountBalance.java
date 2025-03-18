// Java program for exception, to be precise Custom exception linked to UserDefinedException Class on 8 jan 25.

package _3_AFTEROOPS._01_exceptionhandling; // Package declaration

// Custom exception class for minimum account balance violation
public class MinimumAccountBalance extends Exception {
	String message; // Variable to store exception message

	// Constructor to initialize exception message
	public MinimumAccountBalance(String message) { // Accepts a custom error message as input
		this.message = message; // Assigns the input message to the class variable
	}

	// Overrides the toString() method to display custom error message
	@Override
	public String toString() {
		return message; // Returns the custom error message
	}
}
