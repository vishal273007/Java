package pkg01_com.pack1;

public class ClassA10 {
	
	void meth1(int i) { // main() method, i = 100 (Parameterized method)
		System.out.println("Hi");
		System.out.println("i value: "+i);
	}
	
	public static void main(String[] args) {
		ClassA10 obj=new ClassA10(); // Creating an object
		obj.meth1(100); // Calling a method
	}

}
