
// Java program to print even numbers between two given numbers and count of total numbers.

package com.controlstatements.iteration;

public class Ex4ForLoopEvenNoPrinting {
	void meth1(int x, int y) {
		int count = 0; // count is for counting the total no of even numbers that will be printed on
						// consol.
		for (; x <= y; x++) {
			if (x % 2 == 0) {
				System.out.println(x + " is even.");
				count++;
			}

			System.out.println("---------------------");
		}

		System.out.println("\nThere are total " + count + " even numbers.");
	}

	public static void main(String[] args) {
		Ex4ForLoopEvenNoPrinting aobj = new Ex4ForLoopEvenNoPrinting();
		aobj.meth1(10, 20);
	}
}
