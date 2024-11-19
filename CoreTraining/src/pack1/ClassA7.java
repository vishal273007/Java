package pack1;

public class ClassA7 {
	
	void meth1() {  //meth3()
		ClassA7 obj1=new ClassA7();
		obj1.meth5();
		int a=10;
		System.out.println(10);
		System.out.println(54+a);		
	}
	void meth2() {  //meth5()
		int a=20;
		System.out.println(78-a);
	}
	void meth3() {  //main() method
		int a=30;
		ClassA7 obj1=new ClassA7();
		System.out.println(89+1);
		obj1.meth1();
		System.out.println(10);
	}
	void meth4() {
		int a=10;
		System.out.println(89);
		System.out.println(85);
		System.out.println(44);
	}
	void meth5() {  //meth1()
		System.out.println(77);
		ClassA7 obj1=new ClassA7();
		obj1.meth2();
		System.out.println(99);
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		ClassA7 aobj=new ClassA7();
		aobj.meth3();
		System.out.println("End");
	}

}
