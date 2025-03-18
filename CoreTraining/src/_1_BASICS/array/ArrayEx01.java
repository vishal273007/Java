
// Java program for Arrays topic.

package _1_BASICS.array;

import java.util.Arrays;

// package com.array; // compile time error if using after any import statement. It should before import statement.

public class ArrayEx01 {
	void meth1() {
		System.out.println("meth1() called.");
		int arr1[];
		arr1 = new int[4];
		int arr2[] = new int[5];
		int arr3[] = { 100, 200, 300 };
		int arr4[] = new int[] { 11, 22, 33, 44, 55, 66 };
		String s = "Java";

		System.out.println("arr1 length: " + arr1.length);
		System.out.println("arr2 length: " + arr2.length);
		System.out.println("arr3 length: " + arr3.length);
		System.out.println("arr4 length: " + arr4.length);
		System.out.println("s length: " + s.length());

		System.out.println("\narr1: " + arr1);
		System.out.println("arr2: " + arr2);
		System.out.println("arr3: " + arr3);
		System.out.println("arr4: " + arr4);

		System.out.println("\narr1: " + Arrays.toString(arr1));
		System.out.println("arr2: " + Arrays.toString(arr2));
		System.out.println("arr3: " + Arrays.toString(arr3));
		System.out.println("arr4 " + Arrays.toString(arr4));

		arr2[1] = 25;
		arr2[3] = 45;
		System.out.println("\narr2: " + Arrays.toString(arr2));
		System.out.println("----------------------------");
		System.out.println(arr1[3]);
		System.out.println(arr2[2]);
		System.out.println(arr3[2]);
		System.out.println(arr2[arr3.length]);
		System.out.println(arr4[arr4.length / 2]);
		System.out.println(arr4[arr4.length - 1]);

		// System.out.println(arr3[4]);
	}

	public static void main(String[] args) {
		ArrayEx01 aobj = new ArrayEx01();
		aobj.meth1();
	}
}