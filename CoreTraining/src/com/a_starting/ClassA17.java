package com.a_starting;

public class ClassA17 {
	
	String meth1(int x, String s) {
		System.out.println("Hi");
		System.out.println(x/2);
		return s+" is awesome";
	}
	
	public static void main(String[] args) {
		ClassA17 obj1=new ClassA17();
		// obj1.meth1(50,"Java");
		// obj1.meth1(50, "Java");
		System.out.println(obj1.meth1(50, "Java"));
		String result=obj1.meth1(50, "Java");
		System.out.println("Result: "+result);
	}

}
