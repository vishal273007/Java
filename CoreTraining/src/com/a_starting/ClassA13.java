package pack1;

public class ClassA13 {
	
	void meth1(int a, String s) { //meth4(), a=10, s=Hello world
		System.out.println(a+a);
		System.out.println("a");
		System.out.println('a');
		System.out.println(a);
		System.out.println("S: "+s);
	}
	
	void meth2(int a, int b) { // main() method, a=2, b=10
		System.out.println(a*a);
		System.out.println(b);
		new ClassA13().meth4("Java is Awesome."); // Creating and calling object and passing an string alue
		new ClassA13().meth3('A', 100); // Creating and calling a method and passing char and integer value
		System.out.println(a-b);
	}
	
	void meth3(char c, int a) { //meth2(), c=A, a=100
		System.out.println(c);
		System.out.println('c');
		System.out.println(a);
	}
	
	void meth4(String s) {  //meth2(), s=Java is Awesome
		new ClassA13().meth1(10, "Hello world"); // Creating and calling an object and passing integer and string value
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		new ClassA13().meth2(5, 10); // Creating and calling an object and passing two integer values
		System.out.println("End");
	}

}
