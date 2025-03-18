package z_practice;

public class Student {
	
	void meth1() {
		System.out.println("Unknown!");
	}
	
	void meth2(String s) {
		System.out.println("The name of the student is: "+s);
	}
	
	public static void main(String [] args) {
		Student aobj=new Student();
		aobj.meth1();
		new Student().meth2("Shyam");
	}
}
