
// "this" keyword example 3rd example as "using this keyword to return the instance of the present class".

package z_homework;

public class ThisKeywordEx03 {
	ThisKeywordEx03 meth1() { // return type - Class, return statement - Class object.
		System.out.println("meth1() called.");
		return this; // here, this is similar to "new ClassA();".
	}

	ThisKeywordEx03 meth2() { // return type - Class, return statement - Class object.
		System.out.println("meth2()called");
		return this;
	}

	void meth3() { //
		System.out.println("meth3() called.");
	}

	public static void main(String[] args) {
		new ThisKeywordEx03().meth1().meth2().meth3(); // Method chaining.
	}
}
