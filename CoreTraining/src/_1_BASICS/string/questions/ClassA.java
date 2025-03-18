//Given a string, return a string where for every char in the original, there are two chars
//doubleChar("The") ? "TThhee"
//doubleChar("AAbb") ? "AAAAbbbb"
//doubleChar("Hi-There") ? "HHii--TThheerree"

package _1_BASICS.string.questions;

// This class demonstrates how to double each character in a given string.
public class ClassA {

	// Method to double each character in the input string
	public String doubleChar(String str) {
		// Initialize an empty string to store the result
		String msg = "";

		// Loop through each character of the input string
		for (int i = 0; i < str.length(); i++) {
			// Append the current character twice to the result string
			msg = msg + str.charAt(i) + str.charAt(i); // Here's the logic that I can't think
		}
		// Return the final result string with doubled characters
		return msg;
	}

	// Main method to test the doubleChar method
	public static void main(String[] args) {
		// Create an object of ClassA
		ClassA aobj = new ClassA();

		// Call the doubleChar method with input "The" and store the result
		String res = aobj.doubleChar("The");

		// Print the resulting string
		System.out.println(res);
	}
}
