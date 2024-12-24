package com.a;

public class ClassA3 {
	
	void meth1() {
		System.out.println("Hi");
		System.out.println(100);
		System.out.println(10+99);
	}
	
	void meth2() {
		
		System.out.println("Hello");
		ClassA3 aobj=new ClassA3();
		aobj.meth1();
		System.out.println(2*5);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		ClassA3 bobj=new ClassA3();
		bobj.meth2();
		System.out.println("End");
	}

}
