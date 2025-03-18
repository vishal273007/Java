package _1_BASICS._01_pack1;

public class ClassA2 {
	
	public void meth1() {
		System.out.println("meth1() called");
		System.out.println("Hi");
		System.out.println(100);
		
	}
	
	public void meth2() {
		System.out.println("meth2() called");
		System.out.println("Hi");
		System.out.println(200);
	}
	
	public static void main(String[] args) {
		System.out.println("Java is awesome");
		ClassA2 aobj=new ClassA2(); // Creating an object
		aobj.meth2(); // Calling an method
		System.out.println("End");
	}

}
