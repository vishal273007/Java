//Ctrl+Shift+F = Foramt the code automatically

package Homework;

public class StaticKeywordT5 {
	static int x = 10;
	static int y = 20;

	static { //static block
		System.out.println("---Test1 Static Block 1 called---");
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

	static void m1(){ //static method
		int x=100;
		System.out.println("Static method called");
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}

	public static void main(String[] args) { //main method
		m1();
	}

	static { //static block
		System.out.println("---Test2 Static Block 2 called");
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
	}
}

//My expected output:
//---Test1 Static Block 1 called
//x: 10
//y: 20
//---Test2 Static Block 2 called
//X: 10
//Y: 20
//Static method called
//x: 100
//y: 20
