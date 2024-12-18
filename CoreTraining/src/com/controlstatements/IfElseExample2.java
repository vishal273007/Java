// This program is control statement. it is selection control statement where if, if-else, if-else, and switch will be used in upcomming programs.

package com.controlstatements;

public class IfElseExample2 {
	void meth1(int i) {
		System.out.println("meth1() called.");
		if (!(i < 'A')) { // 97<65? --> !(false) --> true
			System.out.println("if block executed");
		}
		System.out.println("meth1() execution completed.");
	}

	void meth2(int i) {
		System.out.println("meth2() called.");
		if (i <= 5) // 50<=5? --> false
			// int x = 10; // can,t write declarative statement here.
			System.out.println("if block executed");
		System.out.println("meth2() execution completed");
	}

	void meth3(int i, int num) {
		System.out.println("meth3() called.");
		if (i <= 5) {
			if (num % 2 == 0) { // 9%2 = 1 remainder, --> false
				System.out.println(num + "is even.");
			} else {
				System.out.println(num + "is odd.");
			}
		}
		System.out.println("meth3() execution completed.");
	}

	void meth4(int i) {
		System.out.println("meth4() called.");
		if (i <= 5) {
			System.out.println("if block exected.");
			System.out.println("Hi");
		} else
			System.out.println("else block executed.");
		System.out.println("Hello");
		System.out.println("meth4() execution complete.");
	}

	void meth5(int i) {
		System.out.println("meth5() called.");
		if (false) {
			System.out.println("if block executed.");
		} else {
			System.out.println("else block executed.");
		}

		System.out.println("meth5() execution completed.");
	}

	void meth6(int num) {
		System.out.println("meth6() called.");
		if (num > 0) { // 0 > 0? --> false
			System.out.println(num + " is positive");
		} else if (num < 0) { // 0 < 0? --> false
			System.out.println(num + " is negative");
		} else {
			System.out.println(num + " num is equal to 0");
		}
		System.out.println("meth6() execution completed.");
	}

	public static void main(String[] args) {
		IfElseExample2 aobj = new IfElseExample2(); // creating an object
		aobj.meth1('a'); // calling a method and passing a parameter to that method.
		aobj.meth2(50);
		aobj.meth3(1, 9);
		aobj.meth4(1);
		aobj.meth5(10000);
		aobj.meth6(0);
	}

}

/*
 * meth1() called -- if block executed -- meth1() execution complete
 * 
 * meth2() called. -- meth2() execution complete.
 * 
 * meth3() called. -- 9 is odd -- meth3() execution completed.
 * 
 * meth4() called. -- if block executed -- Hi -- Hello --- meth4() execution
 * complete
 * 
 * meth5() called -- else block executed -- meth5() execution complete
 * 
 * meth6() called. -- 0 is equal to 0 -- meth6() execution complete
 */
