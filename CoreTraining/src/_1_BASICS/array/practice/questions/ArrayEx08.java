//Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
//
//
//rotateLeft3([1, 2, 3]) ? [2, 3, 1]
//rotateLeft3([5, 11, 9]) ? [11, 9, 5]
//rotateLeft3([7, 0, 0]) ? [0, 0, 7]

// This program demonstrates rotating the elements of an array (length 3) to the left.
// For example, [1, 2, 3] becomes [2, 3, 1].

package _1_BASICS.array.practice.questions;

import java.util.Arrays; // Import Arrays class for printing arrays.

// Define the main class named ClassA
public class ArrayEx08 {

	// Method to rotate elements of an array to the left
	public int[] rotateLeft3(int[] nums) {
		// Store the first element in a temporary variable before overwriting it.
		int temp = nums[0];

		// Shift the second element to the first position.
		nums[0] = nums[1];

		// Shift the third element to the second position.
		nums[1] = nums[2];

		// Assign the saved first element (temp) to the last position.
		nums[2] = temp;

		// Return the modified array.
		return nums;
	}

	// Main method to test the rotateLeft3() function
	public static void main(String[] args) {
		// Create an object of ClassA
		ArrayEx08 aobj = new ArrayEx08();

		// Example test case: Define an input array with 3 elements
		// int[] input = new int[] { 1, 2, 3 }; // Uncomment this line for another test case.
		int[] input = new int[] { 6, 3, 77 }; // Custom test case

		// Call the rotateLeft3() method and store the result
		int[] result = aobj.rotateLeft3(input);

		// Print the rotated array
		System.out.println(Arrays.toString(result));
	}
}
