//Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".
//
//firstTwo("Hello") ? "He"
//firstTwo("abcdefg") ? "ab"
//firstTwo("ab") ? "ab"

package _1_BASICS.string.questions;

// This class contains a method to extract the first two characters of a string.
public class StringEx05 {

	// Method to return the first two characters of the given string.
	public String firstTwo(String str) {
		// Check if the string length is 2 or more.
		if (str.length() >= 2)
			// Return the substring containing the first two characters.
			return (str.substring(0, 2)); // str.substring(0,2) extracts characters from index 0 to 1 (inclusive).

		// If the string length is less than 2, return it as it is (even if empty).
		return str; // Return the given string directly, as it satisfies the condition.
	}

	// Main method to test the functionality of firstTwo() method.
	public static void main(String[] args) {
		// Create an object of ClassA.
		StringEx05 aobj = new StringEx05();

		// Call firstTwo() with the string "Hello" and store the result.
		String result = aobj.firstTwo("Hello");

		// Print the result to verify the output.
		System.out.println(result); // Expected output: "He"
	}
}
