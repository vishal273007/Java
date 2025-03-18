package _2_OOPS._01_inheritance;

public class ClassB4 extends ClassA4 {
	void display() { // main()
		System.out.println("hi");
		super.meth4(); // parent class meth4()
	}

	static int show(int a) { // called from classB4() line 15, a=50
		System.out.println(a + a);
		return a + a++; // now a = 51
	}

	ClassB4() { // main
		//super(); // remember this, it will be called even without writing
		this(show(50)); // this(x) - constructor call, x = show(50) 
		for (int i = 1;; i++) { // infinite loop as no condition
			super.meth4(); // calls parent class meth4()
			break; // will run one time only as it breaks the loop
		}
		System.out.println("hi");
		System.out.println(50);
	}

	ClassB4(int a) { // ClassB() line 15, a = 100
		System.out.println("==>" + (a++ + show(50))); //200, now a = 101
	}

	public static void main(String[] arguments) {
		new ClassB4().display(); // creating object will first go to the available constructor in the program.
	}
}
