// For loop example for logic building. This program is for printing table in way that 
// when you give two ranges, it should print table in between numbers, like 2 to 5, then it prints 2,3,4,5 tables.

package com.controlstatements.iteration;

public class Ex3ForLoop {
	void meth1(int x, int y) { // meth1, x = 2, y = 6
		for (; x <= y; x++) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(x + " " + "*" + " " + i + " " + "=" + (x * i));
			}
			System.out.println("---------------------");
		}
	}

	public static void main(String[] args) {
		Ex3ForLoop aobj = new Ex3ForLoop();
		aobj.meth1(2, 6);
	}
}
