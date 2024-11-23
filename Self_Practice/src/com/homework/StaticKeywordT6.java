

package com.homework;

public class StaticKeywordT6 {
	static int x = m1(); // 1st m1() = 50, --> m1() --> 100 returned by m2() then m1(), x=120 updated from static block

	public static void main(String[] args) {
		System.out.println(StaticKeywordT6.x);
	}

	static { //static block
		System.out.println(x);
		StaticKeywordT6.x = x + 20; // 100 + 20 = 120
	}

	static int m1() { //staic method 1 //static int x variable method call [then m1() = 100]
		StaticKeywordT6.x = 50; //ClassName.identifier to update the m1() value
		return m2(); //calling m2() with only identifier
	}

	static int m2() { //static method 2 // called by static int m1()
		System.out.println(StaticKeywordT6.x);
		return 100;
	}
}


//My output after copying:
//	50
//	100
//	120
	
	