// Java program to print from 1 to 100 numbers with the help of Recursion. 

package com.controlstatements.IfElseExamples;

public class ExPrintOneToHundred {

	static int i = 1;

	void meth1() {
//		for (int i = 1; i <= 100; i++) {
//			System.out.println(i);
//		} // Do it without using loop topic.

		if (i <= 100) {
			System.out.println(i++); //Recursion( Recursion is the process of calling a method by itself
			new ExPrintOneToHundred().meth1();
		}
	}

	public static void main(String[] args) {
		ExPrintOneToHundred aobj = new ExPrintOneToHundred();
		aobj.meth1();
	}
}
