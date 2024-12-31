package pkg01_com.pack1;

public class ClassA12 {
	
	void meth1(int i) { //meth2(), i = 100
		System.out.println("hi");
		new ClassA12().meth3(2); // Creating and calling a method and passing passing value at once
		System.out.println(i/2);
	}
	void meth2(char c) { //main() method, c=A
		System.out.println("hello");
		new ClassA12().meth1(100); // Creating and calling a method passing int value simultaneously
		System.out.println(c);
	}
	
	void meth3(int i) { //meth1(), i = 2
		System.out.println("Hello world");
		System.out.println(i*i);
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Start");
		new ClassA12().meth2('A'); //Creating and calling a method passing a value simultaneously
		System.out.println("End");
		
	}

}
