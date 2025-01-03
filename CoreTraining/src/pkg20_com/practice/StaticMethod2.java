//This program is for static method and how can we call the static method.

package pkg20_com.practice;

public class StaticMethod2{

	int x=100; //instance/non-static/global variable
	static int y=1000; //static/class variable

	void meth1(){ //normal/instance/concrete/non-static method

		System.out.println("meth1() called");
		System.out.println("Instance variable x: "+x);
		System.out.println("Static variable y: "+y+"\n");

	}

	static void meth2(){ //static method

		System.out.println("meth2() called");
		System.out.println("Instance variable x: "+new StaticMethod2().x);
		System.out.println("Static variable y: "+y+"\n");

	}

	public static void main(String[] args){

		StaticMethod2 aobj=new StaticMethod2();
		aobj.meth1();
		aobj.meth2(); //by using Class Object
		StaticMethod2.meth2(); //by using Class Name
		meth2(); //by using identifier

	}

}
