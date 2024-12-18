
// java program for "this" keyword and "this()" constructor call method. 
// this keyword is used for accessing methods and variable. it can't be used inside static area.
// this() constructor call is used to call class constructor. this() can only be used inside a constructor 
// and at the first line only inside a constructor. otherwise it will give c.t.error.

package Homework;

public class ThisKeywordEx04 {
	void meth1() {
		System.out.println("java is awesome");
	}

	ThisKeywordEx04() {
		this(100); // same as "new Class(100(int x))"
		this.meth1(); // same as "new ClassA().meth1();"
		System.out.println("Default constructor.");
	}

	ThisKeywordEx04(int x) { // ClassA(), x = 100
		System.out.println("Parameterized constructor: " + x);
	}

	public static void main(String[] args) {
		new ThisKeywordEx04();
	}

}
