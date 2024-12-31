package pkg01_com.pack1;

public class ClassA8 {
	
	void meth1() {
		System.out.println("Hello, Here you called method 1.");
	}
	
	public static void main(String[] args) {
		System.out.println("Java is awesome");
		//ClassA8 aobj=new ClassA8();
		//aobj.meth1();
		System.out.println("Test Texts");
		new ClassA8().meth1();
	}

}
