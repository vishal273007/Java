//This program is about the static block. It's third type how we can use a static keyword in java. Static block run even before main method but main() is required for running the program, otherwise we will not be able to compile the code. Till java 1.5, it was possible to run the java program only with static block only but after that, main() become mandatory.

package com.practice;

public class StaticBlock3{

	final static int x; //final static variables are compile time constant

	static{
		x=100;
		System.out.println("First static block executed: "+x);
	}

	public static void main(String[] args){

		System.out.println("Class main() called: "+x);

	}

	static{
		System.out.println("Second static block exected: "+x);
	}

}
