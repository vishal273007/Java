
//Given an int array length 3, if there is 2 in the array immediately followed by a 3, change the element 3 to 0, and return the changed array.
//123---120
//234---204
//122---122

package pkg09_com.array.practice.questions;

import java.util.Arrays;

public class ArrayEx01 {
	int[] consecutiveTwoThree() {
		// int arr[] = { 1, 2, 3 };
		int arr[] = { 3, 2, 3 }; // creating an array and storing value in it.

		for (int i = 0; i <= arr.length - 2; i++) { // initialing a loop from 0.
			if (arr[i] == 2 && arr[i + 1] == 3) { // comparing array any index for 2 and and next index for 3
				arr[i + 1] = 0; // assigning 0 at the index that is 3 if there's 2 before 3.
			}
		}

		return arr; // returning value that is compatible with method return type.

	}

	public static void main(String[] args) {
		ArrayEx01 aobj = new ArrayEx01();
		int result[] = aobj.consecutiveTwoThree(); // storing the return array value of meth1
		System.out.println(Arrays.toString(result)); // printing the the result which stored array.
	}
}
