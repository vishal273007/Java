package com.array.practice.questions;

public class ArrayEx07 {
	public int sum3(int[] nums) {
		// Return the sum of all the elements.
		return nums[0] + nums[1] + nums[2]; // look carefully what you write. you wrote num[3] still you were not able
											// to identify.
	}

	public static void main(String[] args) {
		ArrayEx07 aobj = new ArrayEx07();
		// int input[] = {1,2,3}; //Test input
		int input[] = { 8, 2, 3 }; // Test input

		// Capture the result ***
		int result = aobj.sum3(input); // Call the sum3 method of aobj with input array and store the returned sum in
										// 'result'.

		System.out.println("sum: " + result);
	}
}