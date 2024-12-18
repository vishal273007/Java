package com.operators.examples;

public class Operators6 {
	
	void meth1(int i) { //main i = 5
		System.out.println("meth1() called");
		if(i>=10) {
			System.out.println("If block executed.");
		}
		else {
			System.out.println("else block executed");
		}
	}
	
	void checkEligibility(String name, int age) { //main() name = Kishan, age = 36
		if(age>=29) {
			System.out.println("You are eligible for marriage.");
		}
		else {
			System.out.println(name+"You still need to wait for" +(29-age)+ "more years.");
		}
	}
	
	void examEligibility(String name, int age) { //main()
		if(age>=21 && age<=35) {
			System.out.println("You are eligible for the exam.");
		}
		else {
			System.out.println("You are not eligible for the exam.");
		}
	}
	
	public static void main(String[] args) {
		Operators6 aobj=new Operators6();
		aobj.meth1(5);
		aobj.checkEligibility("Kishan",36);
		aobj.examEligibility("Sujata", 10);
	}

}
//output:
//	meth1() called
//	else block executed
//	
//	You are eligible for marriage
//	
//	You are not eligible for the exam
	
	
