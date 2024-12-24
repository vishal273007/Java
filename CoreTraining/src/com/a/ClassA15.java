package com.a;

public class ClassA15 {
	
	int meth1() { //main()	
		System.out.println("meth1() called");
		return 99;
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		int x = 100;
		ClassA15 obj1=new ClassA15(); // Creating an object
		int data = obj1.meth1(); // Calling meth1() and saving it's return value in data
		System.out.println("X: "+x);
		System.out.println("data: "+data);
		System.out.println("End");
	}

}
