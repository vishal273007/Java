//Ctrl+Shift+F --> Format automatically

package Homework;

public class StaticKeywordT7 {
	static int a = 0;
	int b = 0;

	StaticKeywordT7(){
		a++; //1st --> 0+1=1, 1+1=2, 2+1=3, 3+1==4, 4+1=5
		b++; //1st --> 0+1=1, 0+1=1, 0+1=1, 0+1=1, 0+1=1
		System.out.println("Static variable: "+a);
		System.out.println("Instance variable: "+b);
		System.out.println("======================");
	}

	void display() {
		System.out.println("***Accessing Static Variable***");
		System.out.println(StaticKeywordT7.a);
		System.out.println(a);
		System.out.println(new StaticKeywordT7().a);
	}

	public static void main(String[] args){
		new StaticKeywordT7(); //While creating an object, an available Constructor will be automatically gets called.
		new StaticKeywordT7();
		new StaticKeywordT7();
		System.out.println("##################################################");
		new StaticKeywordT7().display();
	}
}

//My output after copying
//Static variable: 1
//Instance variable: 1
//=========================
//Static variable: 2
//Instance variable: 1
//========================
//Static variable: 3
//Instance variable: 1
//#####################################################
//Static variable: 4
//Instance variable: 1
//***Accessing Static Variables***
//4
//4
//Static variable: 5
//Instance variable: 1
//========================
//5
