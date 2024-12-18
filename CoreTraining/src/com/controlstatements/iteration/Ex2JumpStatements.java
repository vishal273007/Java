//Java program for jump code.

package com.controlstatements.iteration;

public class Ex2JumpStatements {
	void meth1() {
		System.out.println("meth1() called.");
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				// break;
				continue;
				// return;
			}
			System.out.println("i value: " + i);
		}

		System.out.println("Compiler came out of for loop.");
	}

	public static void main(String[] args) {
		System.out.println("Start");
		Ex2JumpStatements aobj = new Ex2JumpStatements();
		aobj.meth1();
		System.out.println("End");
	}
}
