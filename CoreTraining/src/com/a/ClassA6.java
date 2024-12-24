package com.a;

public class ClassA6 {
	
	void meth1() {
		int i = 10;
		ClassA6 aobj=new ClassA6();
		aobj.meth2();
		System.out.println(i + 90);
	}
	
	void meth2() {
		int x = 1000;
		System.out.println(x - 1);
		
	}
	
	public static void main(String[] args) {
		
		
		ClassA6 bobj=new ClassA6();
		
		bobj.meth1();
	}

}
