package com.a_starting;

public class ClassA5 {
	
	
	//Check the programs output and edit and run agian after clarification
	
	void meth1() {
		System.out.println("meth1() called");
		int i=100;
		System.out.println("i");
		System.out.println(i);
		System.out.println("i"+i);
		
		System.out.println(i + i);
		
		System.out.println("i "+99);
		System.out.println(i + 99);
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		ClassA5 aobj=new ClassA5();  //  Creating an object
		aobj.meth1();  // Calling an method
		System.out.println("End");
	}

}
