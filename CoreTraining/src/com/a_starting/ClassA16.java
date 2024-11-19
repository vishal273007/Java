package pack1;

public class ClassA16 {
	
	int meth1(String s) { // main() method, s=Java
		System.out.println("Hi");
		System.out.println(s);
		return 5;
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println(new ClassA16().meth1("Java")); // Creating and calling an object and passing string value inside println statement
		System.out.println("End");
	}

}
