package com.practice;

public class ClassCons1 {
	public void meth1() {
		System.out.println("Meth1() called");
	}
	
	public ClassCons1() {
		new ClassCons1(500).meth1();
		System.out.println("Non Parameterized method called");
		new ClassCons1(100);
	}
	
	public ClassCons1(int a) {
		System.out.println("Parameterized method called: "+a);
	}
	
	public static void main(String [] args) {
		System.out.println("Start");
		ClassCons1 aobj=new ClassCons1();
		aobj.meth1();
		System.out.println("End");
	}

}
