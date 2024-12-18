package com.controlstatements.IfElseExamples;

public class IfElseExamplr {
	void meth1(int x, int y, int z) {
		if (x > y) {
			if (x > z) {
				System.out.println(x + " is gretaest.");
			} else {
				System.out.println(z + " greatest");
			}
		}

		else {
			if (y > z) {
				System.out.println(y + " is biggest");
			} else {
				System.out.println(z + " z greatest.");
			}
		}
	}

	public static void main(String[] args) {
		IfElseExamplr aobj = new IfElseExamplr();
		aobj.meth1(5, 7, 30);

	}
}
