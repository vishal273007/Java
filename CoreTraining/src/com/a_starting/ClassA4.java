package com.a_starting;

public class ClassA4 {
	
	void meth1() {
		System.out.println("hi");
		int x = 10;
		int y = 90;
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		System.out.println("Addition : "+(x+y));
		
		
	}
	
	
	public static void main(String[] args) {
		
		ClassA4 aobj=new ClassA4();  //Creating an object
		System.out.println("Start");
		
		System.out.println("Java is awesome");
		
		aobj.meth1();  // calling an object
		System.out.println("End");
	}

}
