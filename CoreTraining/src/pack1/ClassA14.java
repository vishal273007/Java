package pack1;

public class ClassA14 {
	
	void meth1(int x, int y, int z) { // meth3(), x=5, y=10, y=6
		System.out.println(10);
		new ClassA14().meth2("Hi", 100); // Creating and calling an object and passing values
		System.out.println(10+x);
		System.out.println(y);
		System.out.println(10-z);
	}
	
	void meth2(String s, int num) { // meth1(), s=Hi, num = 100
		
		System.out.println(s);
		System.out.println(num - 20);
		System.out.println(num);		
	}
	
	void meth3(char c, int x, String s) { // main() method, c=X, x=50, s=Hello
		System.out.println(c);
		new ClassA14().meth1(5, 10, 6); // Creating and calling an object with passing integer values
		System.out.println(x/2);
		System.out.println(30);
		System.out.println(5);
	}
	
	
	public static void main(String[] args) {
		System.out.println("Start");
		new ClassA14().meth3('X', 50, "Hello"); // Creating and calling an object with passing values
		System.out.println("End");
	}

}
