package _2_OOPS._01_inheritance;

public class ClassA4 { //ClassA4() line 28
	void meth1() {
		System.out.println(10);
		System.out.println(this.meth2() + 56);
	}

	int meth2() { // meth1()
		System.out.println(75);
		System.out.println(96);
		return this.meth3(); // this line invokes meth3() as -18
	}

	int meth3() {
		System.out.println(74);
		System.out.println(92);
		return 74 - 92; // -18 is returned to meth2 and calculated and returned to meth1()
	}

	void meth4() {
		System.out.println(56);
	}

	ClassA4() { //Child ClassB4 super() - automatic constructor call.
		this(52); // invokes parameterized constructor with 52 value
		this.meth1(); // invokes meth1 in the same class.
		System.out.println(85);
	}

	ClassA4(int a) { // classA4() default constructor,  a = 52
		System.out.println(a + 7); // my output 57, what a brainless person am I, the values are given explicitly and I am pre-assuming 52 as 50 and writing 57 instead of 59.
	}

}
