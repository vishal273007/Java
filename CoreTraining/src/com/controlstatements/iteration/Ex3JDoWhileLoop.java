package com.controlstatements.iteration;

public class Ex3JDoWhileLoop {
	void meth1() {
		int i = 0, j = 0;
		while (i < 3) { // Outer loop: Runs while i < 3
			do {
				j++; // Increment j
				System.out.print(j + " "); // Print j
			} while (j < 2); // Inner loop: Runs while j < 2

			i++; // Increment i to prevent infinite loop
		}
	}

	public static void main(String[] args) {
		Ex3JDoWhileLoop aobj = new Ex3JDoWhileLoop();
		aobj.meth1();
	}
}
