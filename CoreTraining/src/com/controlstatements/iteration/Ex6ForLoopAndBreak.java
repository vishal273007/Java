
// Java code for for loop with break statement.

package com.controlstatements.iteration;

public class Ex6ForLoopAndBreak {
	void display() {
		int a = 10;
		for (int k = (a++) + (++a) + (++a); k > 10; k++) {
			System.out.println(k);
			break;
		}
	}

	public static void main(String[] args) {
		Ex6ForLoopAndBreak a = new Ex6ForLoopAndBreak();
		a.display();
	}
}
