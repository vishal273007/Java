//static variable and static block are excecuted by defined order.
//We can call a static method with three ways: 1. identifier name, 2.class object, and 3. class name.

package z_homework;

public class StaticKeywordProgram {
	static int i = StaticKeywordProgram.meth1(); // this will invoke meth1(), then i = 100
//	static int i = 500;

	static int meth1(){ //StaticKeywordProgram.meth1() from static variable
	System.out.println("meth1() called");
	return 100;
	}

	public static void main(String[] args){
	System.out.println("main() called: "+i);
	}

	static{
	System.out.println("static block called: "+i);
	}
}

//Expected output
//meth1() called
//static block called: 100
//main() called: 100


//Commented output:
//static block called: 500
//main() called: 500
