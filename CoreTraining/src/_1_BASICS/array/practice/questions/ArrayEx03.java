package _1_BASICS.array.practice.questions;

public class ArrayEx03 {

	public boolean firstLast6(int[] nums) {

		if (nums[0] == 6 || nums[nums.length - 1] == 6) {
			return true;
		}

		return false;

	}

	public static void main(String[] args) {
		ArrayEx03 aobj = new ArrayEx03();

		// int[] input = { 1, 2, 6 };
		// int[] input = {6, 1, 2, 3};
		int[] input = { 13, 1, 2, 3 };
		System.out.println(aobj.firstLast6(input));

	}
}

// Ctrl + H = Find and replace
// Ctrl + H = find and replace

// Ctrl + H = find and replace
// Ctrl + H = find and replace

// Ctrl + H = find and replace

// Ctrl + H = find and replace

// ctrl + h = find and replace
// ctrl + h = find and replace