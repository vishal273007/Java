
//Java program for 'this' keyword. This first example for 
// resolving the ambiguity between instance variable and local variable.

package Homework;

public class ThisKeywordEx01 {

	int x = 10; // instance/global/non-static variable
	static int y = 20; // static/class variable

	void meth1() {
		int x = 1000; // local variable
		int y = 2000;

		System.out.println("Instance variable x: " + this.x); // here [this.x = new ClassA().x] same as.
		System.out.println("Static variable y: " + ThisKeywordEx01.y); // static variable can be accessed with
		// three methods but ClassName.variable name is suggested.
	}

	public static void main(String[] args) {
		new ThisKeywordEx01().meth1();
	}
}
