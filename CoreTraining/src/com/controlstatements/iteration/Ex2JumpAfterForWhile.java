// Java program for while loop and and if statement.

package com.controlstatements.iteration;

public class Ex2JumpAfterForWhile {
	void meth1(int b) { // b = 20
		int a = 10;
		while (a <= 20) { // Outer loop: 10 <= 20
			if (a == 15) { // Check if 'a' is 15
				while (b <= 30) { // Inner loop for 'b'
					if (b == 25) { // If 'b' is 25
						break; // Exit inner loop
					}
					System.out.println("b value: " + b);
					b++; // Increment 'b'
				}
			}
			System.out.println("a value: " + a);
			a++; // Increment 'a'
		}
	}

	public static void main(String[] args) {
		Ex2JumpAfterForWhile aobj = new Ex2JumpAfterForWhile();
		aobj.meth1(20);
	}
}
