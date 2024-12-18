//Java program to print multidimensional array.

package com.array;

public class ArrayEx04 {
	void meth1() {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < 3; i++) { // i=0( and 1,2) --> 0( and 1,2) < 3 --> Go in loop
			for (int j = 0; j < 3; j++) { // i=0,1,2 --> 0,1,2 < 3 --> print one by one in same line
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new ArrayEx04().meth1();
	}
}