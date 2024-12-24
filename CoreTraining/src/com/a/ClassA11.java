package com.a;

public class ClassA11 {
	
	void display(String s, int i, char c) { //main() method, s=Java is Awesome, i=99, c=z
		System.out.println("s");
		System.out.println(s);
		System.out.println('s');
		System.out.println("i");
		System.out.println(i);
		System.out.println('c');
		System.out.println(c);
		System.out.println(i+99);
		System.out.println("i+99");
	}
	
	public static void main(String[] args) {
		new ClassA11().display("Java is Awesome", 99, 'z'); //Creating and calling a method at onece
	}

}
