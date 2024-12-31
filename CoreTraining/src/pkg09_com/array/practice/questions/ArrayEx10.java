//Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
//
//
//middleWay([1, 2, 3], [4, 5, 6]) ? [2, 5]
//middleWay([7, 7, 7], [3, 8, 0]) ? [7, 8]
//middleWay([5, 2, 9], [1, 4, 5]) ? [2, 4]

package pkg09_com.array.practice.questions;

import java.util.Arrays;

public class ArrayEx10 {

	public int[] middleWay(int[] a, int[] b) {

		int[] arr = { a[1], b[1] };

		return arr;
	}

	public static void main(String[] parameters) {
		ArrayEx10 obj = new ArrayEx10();
		//		int[] input1 = new int[] { 1, 2, 3 };
		//		int[] input2 = new int[] { 4, 5, 6 };

		int[] input1 = new int[] { 7, 7, 7 };
		int[] input2 = new int[] { 3, 8, 0 };
		int[] result = obj.middleWay(input1, input2);
		System.out.println("The desired output is: " + Arrays.toString(result));
	}

}
