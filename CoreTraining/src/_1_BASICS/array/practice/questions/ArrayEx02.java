//Given an array of integer, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, return 0 if the array length is 0.
//1,2,3---3
//5,5---10
//8,2,1,4---10

package _1_BASICS.array.practice.questions;

public class ArrayEx02 {
	public int meth3(int[] arr) {

		if (arr.length >= 2) {
			return arr[0] + arr[1];
		}

		else if (arr.length == 1) {
			return arr[0];
		}

		else {
			return 0;
		}

		// My half correct Logic ( wrong vacant array)
		// if (arr.length < 2) {
		// return arr[0];
		// }

		// else if (arr.length == 0) {
		// return 0;
		// }

		// return arr[0] + arr[1];

	}

	public static void main(String[] arguments) {
		ArrayEx02 aobj = new ArrayEx02();
		// int[] input = { 2, 5, 7 };
		// int[] input = { 5, 5 };
		int input[] = { 9, 8, 3, 8 }; // creating an array and holding values
		System.out.println(aobj.meth3(input)); // calling the method and passing the args(arguments)
	}
}