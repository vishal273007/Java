
package _1_BASICS.array;

import java.util.Arrays;

public class ArrayTask07 {
	String[] meth1(int arr1[], char arr2[]) { // arr1 = [11, 22, 33]
		// Task 1: Pass all the elements which are present in arr1
		// in reverse order in another array and print both the arrays.

		System.out.println("--- Task 1 ---");
		int nums[] = new int[arr1.length];
		int j = 0;
		for (int i = arr1.length - 1; i >= 0; i--) {
			nums[j] = arr1[i];
			j++;
		}

		System.out.println("arr1: " + Arrays.toString(arr1));
		System.out.println("nums: " + Arrays.toString(nums));

		// Task 2: Print all the statements which are present in arr2 by using for
		// loop(in both directions) & by using for-each loop(in one direction)
		System.out.println("\n--- Task 2 ---");
		for (int i = 0; i <= arr2.length - 1; i++) {
			System.out.print(arr2[i] + " ");
		}

		System.out.println();

		for (int i = arr2.length - 1; i >= 0; i--) {
			System.out.print(arr2[i] + " ");
		}

		System.out.println();

		for (char c : arr2) {
			System.out.print(c + " ");
		}

		/*
		 * Task 3: You need to implement this task3 in main(). If the length of an array
		 * which is returned by meth1() is even Then retrieve the first half of the
		 * elements.
		 * 
		 * If the length of an array which is returned by meth1() is odd then retrieve
		 * only last two elements of the array.
		 * 
		 * Note the length of the array which is returned by meth1() should be at least
		 * 2.
		 */

		return new String[] { "hi", "hello", "java", "Friday" };
	}

	public static void main(String[] parameters) {

		ArrayTask07 aobj = new ArrayTask07();

		int input1[] = { 11, 22, 33 };
		char input2[] = { 'A', 'B', 'C' };
		String result[] = aobj.meth1(input1, input2);

		System.out.println("\n\n------------Task3----------");

		if (result.length % 2 == 0) {
			for (int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
			}
		}

		else {
			System.out.println(result[result.length - 2]);
			System.out.println(result[result.length - 1]);

		}
	}

}
