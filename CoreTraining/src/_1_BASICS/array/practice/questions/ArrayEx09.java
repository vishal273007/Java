// Given an array of ints length 3, figure out which is larger, the first or last element in the array, 
// and set all the other elements to be that value. Return the changed array.
//
// Examples:
// maxEnd3([1, 2, 3]) ? [3, 3, 3]
// maxEnd3([11, 5, 9]) ? [11, 11, 11]
// maxEnd3([2, 11, 20]) ? [20, 20, 20]

package _1_BASICS.array.practice.questions;

// Importing Arrays utility class for helper methods
import java.util.Arrays;

public class ArrayEx09 {
	// Method to modify the array based on the max value of the first or last element
	public int[] maxEnd3(int[] nums) {
		// Find the maximum value between the first and last elements of the array
		int max = Math.max(nums[0], nums[2]);

		// Replace all elements in the array with the maximum value
		Arrays.fill(nums, max);

		// Return the modified array
		return nums;

		// My earlier solution (commented below) was logically complex and had extra code.
		// The current solution is optimized using Math.max() and Arrays.fill().
		//
		// Old solution (commented out):
		//
		// if (nums[0] > nums[1] && nums[0] > nums[2]) {
		//     nums[1] = nums[0];
		//     nums[2] = nums[0];
		//     return nums;
		// } else if (nums[1] > nums[0] && nums[1] > nums[2]) {
		//     nums[0] = nums[1];
		//     nums[2] = nums[1];
		//     return nums;
		// } else {
		//     nums[0] = nums[2];
		//     nums[1] = nums[2];
		//     return nums;
		// }
	}

	// Main method to test the maxEnd3() function
	public static void main(String[] args) {
		// Create an instance of the class
		ArrayEx09 obj = new ArrayEx09();

		// Input array to be modified
		int[] input = new int[] { 1, 2, 3 };
		// int[] input = new int[] { 11, 6, 3 }; // Uncomment to test another case

		// Call the method and store the result
		int[] result = obj.maxEnd3(input);

		// Print the modified array
		System.out.println("The array with max element at all places after replacing is: " + Arrays.toString(result));
	}
}
