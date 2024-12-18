// Java program for for loop with arithmetic operations.

package com.controlstatements.iteration;

public class Ex7ForLoopAndIncrementDecrement {
	void display() {
		int a = 10;
		for (int k = (a++ + new Ex7ForLoopAndIncrementDecrement().meth1(5)) + (++a + 3) + (++a + 3); k > 10; k++) {
			System.out.println(k + 6);
			break;
		}
	}

	int meth1(int a) {
		return new Ex7ForLoopAndIncrementDecrement().meth2(10 + 1, 15 - 3) + (a * 2);
	}

	int meth2(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Ex7ForLoopAndIncrementDecrement a = new Ex7ForLoopAndIncrementDecrement();
		a.display();
	}
}
