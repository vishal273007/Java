// java program of iteration using for loops to solidify understanding.

package com.controlstatements.iteration;

public class Ex2ForLoop {
	void meth1() {
		System.out.println("---mehth1()---");

		for (int i = 1; i <= 5; ++i) {
			System.out.println("i value: " + i);
		}
		System.out.println("meth1() completed.");
	}

	void meth2() {
		System.out.println("---meth2()---");

		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j >= 3; j--) {
				System.out.println("i: " + i + " & j: " + j);
			}
			System.out.println("---------------");
		}
		System.out.println("meth2() completed.");
	}

	void meth3() {
		System.out.println("---meth3()---");

		int i = 1;
		for (; i <= 5;)
			// int i = 1; //can't write declarative statements here.
			System.out.println("i value: " + i);
		i++; // increment at this place will make infinite loop. Press the red button on
				// output tab to stop execution
		System.out.println("meth3() completed.");
	}

	void meth4() {
		System.out.println("---meth4()---");

		for (int i = 1; i <= 10; i++)
			System.out.println("i value: " + i);
		System.out.println("meth4() completed.");
	}

	void meth5() {
		System.out.println("---meth5()---");

		for (int i = 1; i <= 5; i++) {
			char c = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print(c + " ");
				c++;
			}
			System.out.println();
		}
		System.out.println("meht5() completed.");
	}

	void meth6() {
		int i = 1;
		for (System.out.print("---meth6()"), System.out.println("---"); i <= 3; System.out
				.println(new Ex2ForLoop().meth7())) {
			System.out.println("i value: " + i++);
		}
		System.out.println("meth6() completed.");
	}

	String meth7() {
		System.out.println("meth7() called.");
		return "java is awesome";
	}

	void meth8() {
		System.out.println("---meth8()---");

		int i = 1;
		for (;;) { // if no condition is given, then it's treated as true making as infinite loop
					// unless explicitly using break statement.
			System.out.println("i value: " + i++);
			break;
		}

		// System.out.println("meth8() completed"); //C. E.
	}

	public static void main(String[] args) {
		Ex2ForLoop aobj = new Ex2ForLoop();
//		aobj.meth1();
//		aobj.meth2();
//		aobj.meth3();
//		aobj.meth4();
//		aobj.meth5();
//		aobj.meth6();
		aobj.meth8();
	}
}
