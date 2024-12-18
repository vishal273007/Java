
// in this example, "this" keyword is used to CALL THE CLASS METHODS WHICH ARE PRESENT IN THE PROGRAM.

package Homework;

public class ThisKeywordEx02 {
	static void meth1() { // meth2()
		System.out.println("meth1() called.");
	}

	void meth2() { // meth3()
		ThisKeywordEx02.meth1(); // it is recommended to call a static method using class name.
		System.out.println("meth2() called.");
	}

	void meth3() { // main()
		this.meth2(); // here "this.meth2()" is similar to "new ClassA().meth2()".
		System.out.println("meth3() called.");
	}

	public static void main(String[] args) {
		ThisKeywordEx02 aobj = new ThisKeywordEx02();
		aobj.meth3();
		// this.meth3(); // we cannot use "this" keyword in static area.
	}
}
