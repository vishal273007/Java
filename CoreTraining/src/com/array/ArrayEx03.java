// java program for array implementation.

package com.array;

public class ArrayEx03 {
	void meth1() {
		int arr1[] = new int[0];
		System.out.println("arr1 length: " + arr1.length);

		// arr1[0] = 100; // ArrayOutOfBoundException
		// System.out.println(arr1[0]);

		// int arr2[] = new int[-5]; // java.lang.NegativeArraySizeExceptionl: -5
		// System.out.println("arr2 length: " + arr2.length);

		// boolean arr3[] = new boolean[2147483647];

		float arr4[] = new float['A'];
		System.out.println("arr4 length: " + arr4.length);
	}

	public static void main(String[] args) {
		new ArrayEx03().meth1();
	}
}