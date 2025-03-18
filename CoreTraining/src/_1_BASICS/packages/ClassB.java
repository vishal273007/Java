package _1_BASICS.packages; // just like com.packages

public class ClassB {
	public void meth2() {
		System.out.println("ClassB method called.");
	}

	public static void main(String[] args) {
		ClassA aobj = new ClassA();
		aobj.meth1();
	}
}
