//Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
//
//firstHalf("WooHoo") ? "Woo"
//firstHalf("HelloThere") ? "Hello"
//firstHalf("abcdef") ? "abc"

package com.string.questions;

// This class contains a method to return the first half of a string.
public class StringEx06 {

	// Method to return the first half of the given string.
	public String firstHalf(String str) {
		// Extract and return the substring from index 0 to half the length of the
		// string.
		return str.substring(0, str.length() / 2); // str.length() / 2 calculates the midpoint.
	}

	// Main method to test the functionality of firstHalf() method.
	public static void main(String[] args) {
		// Create an object of ClassA.
		StringEx06 aobj = new StringEx06();

		// Call firstHalf() with the string "HelloThere" and store the result.
		String res = aobj.firstHalf("HelloThere");

		// Print the result to verify the output.
		System.out.println(res); // Expected output: "Hello"
	}
}
