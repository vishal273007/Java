
// java example for "this" keyword.

package z_homework;

public class ThisKeywordEx06 {
	public int meth1(int a, int b) {
		System.out.println("meth1() called.");
		System.out.println(b);
		System.out.println(100);
		return (a + b) + 10 + (a - b);
	}

	public int meth2() {
		System.out.println("meth2() called.");
		return this.meth3() + 8;
	}

	public ThisKeywordEx06() { // main() - 1st call
		this("java is awesome"); // similar to "new ClassA("java is awesome");"
		System.out.println(50);
	}

	int meth3() {
		System.out.println("meth3() called.");
		return 10;
	}

	public String meth4(int a, String s) {
		System.out.println("meth4() called.");
		a = a + 4;
		System.out.println("a value: " + a);
		System.out.println("s value: " + s);
		return s + " is an OOP language.";
	}

	public int meth5(int a) {
		System.out.println("meth5() called.");
		return 10 - a;
	}

	public ThisKeywordEx06(String s) { // ClassA() --> s = "java is awesome"
		String result = this.meth4(this.meth1(this.meth2(), this.meth5(5) + 'A' - ('a')), "java"); // new
																									// ClassA().meth4(.,.);
		System.out.println(result);
		System.out.println(s);
	}

	public static void main(String[] args) {
		new ThisKeywordEx06();
	}
}
