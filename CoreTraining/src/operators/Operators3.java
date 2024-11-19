package com.practice;

public class Operator3 {
	void meth1(int x, int y, int z) {
		System.out.println("Addition: "+(x+y+z));
		new Operator3().meth2(100, 1);
	}
	
	void meth2(int x, int y) {
		System.out.println("Subtraction: "+(x-y));
	}
	
	Operator3(){
		System.out.println("Division: "+(10/2));
	}
	
	Operator3(int x){
		System.out.println("Multiplication: "+(x*2));
	}
	
	public static void main(String[] args) {
		new Operator3(100).meth1(5, 10, 15);
	}
}
