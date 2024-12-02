
// Java program of while and do-while loop to unerstanding and solidifying the loops.

package controlstatements.iteration;

public class Ex1WhileLoop {
	void meth1(int i) {
		System.out.println("meth1() execution started");

		while (i <= 5) {
			System.out.println("i value: " + i);
			i++;
		}
		System.out.println("meth1() execution complete. \n");
	}

	void meth2(int i) {
		System.out.println("meth2() execution started.");

		while (i <= 10) {
			// System.out.println("i value: " + i++ + ++i);
			System.out.println("i value: " + (i++ + ++i));
		}
		System.out.println("meth2() execution completed. \n");
	}

	void meth3(int i) {
		System.out.println("meth3() execution started.");

		while (i <= 10) {
			// System.out.println("i value: " + i++ + ++i);
			System.out.println("i value " + (i++ + ++i));
		}
		System.out.println("meth3() execution completed. \n");
	}

	void meth4(int i) {
		System.out.println("meth4() execution started.");

		while (i <= 5) {
			// int i = 10; //not a valid place to declare variable.
			System.out.println("i value: " + i);
			i++; // writing increment here will infinite loop if not enclosed within {} in for
					// block.
		}
		System.out.println("meth4() execution completed. \n");

	}

	void meth5(int i) {
		System.out.println("meth5() execution started.");

		do {
			System.out.println("i value: " + i);
			i++;
		} while (i <= 5);
		System.out.println("meth5() execution completed.");
	}

	public static void main(String[] args) {
		Ex1WhileLoop aobj = new Ex1WhileLoop();
		aobj.meth1(1);
		aobj.meth2(1);
		aobj.meth3(1);
		aobj.meth4(1);
		aobj.meth5(100);
	}
}
