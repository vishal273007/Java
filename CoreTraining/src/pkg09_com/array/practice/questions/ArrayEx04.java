
//Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.

//sameFirstLast([1, 2, 3]) ? false
//sameFirstLast([1, 2, 3, 1]) ? true
//sameFirstLast([1, 2, 1]) ? true

package pkg09_com.array.practice.questions;

public class ArrayEx04 {
	public boolean sameFirstLast(int[] nums) {
		if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) // first, length of nums is greater and equals to 1,
																	// second, comparing the first and last index value
																	// of
																	// array.
			return true;

		return false;

	}

	public static void main(String[] args) {
		ArrayEx04 aobj = new ArrayEx04();

		// int input[] = {1,2,3};
		// int input[] = {1,2,3,1};
		int input[] = { 1, 2, 1 }; // creating an array and assigning valaues in it
		System.out.println(aobj.sameFirstLast(input)); // in output statement, calling the method and passing the
														// arguments for accepting the returned value by method.

	}
}