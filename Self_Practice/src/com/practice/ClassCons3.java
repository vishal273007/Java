package com.practice;

public class ClassCons3 {
	
	int calculate(int x) {
		System.out.println("Inside calculate: "+x);
		return x*3;
	}
	
	int compute(int a, int b) {
		System.out.println("Inside Compute: "+a+""+b);
		return a+b;
	}
	
	int process(int m, int n) {
		System.out.println("Inside process: "+m+","+n);
		return m-n;
	}
	
	int analyze(int p, int q, int r) {
		System.out.println("Inside analyze: "+p+","+q+","+r);
		return p*q+r;
	}
	
	int evaluate(int x) {
		System.out.println("Inside evaluate: "+x);
		return x/2;
	}
	
	ClassCons3(){
		System.out.println(10);
	}
	
	ClassCons3(int a, String s){
		System.out.println(a);
		System.out.println(s);
	}
	
	ClassCons3(String s, int x){
		System.out.println(x);
		System.out.println((x*2)+100);
	}
	
	public static void main(String [] args) {
		int result = new ClassCons3().calculate(new ClassCons3(new ClassCons3().evaluate(6),"hi").compute(10, new ClassCons3().process(8,4)) + new ClassCons3("hi", 20).analyze(5,3, new ClassCons3().evaluate(6)));
		System.out.println("Final Result: "+result);
	}

}
