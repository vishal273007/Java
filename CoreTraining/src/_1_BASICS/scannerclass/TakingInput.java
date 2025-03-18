// Java program to use Input at the runtime from the user.
// Scanner is a class and nextInt(), nextLine(), next() are method defined in the Scanner class.
// We need to import the Scanner class to use input because Scanner class in another package.

package _1_BASICS.scannerclass;

import java.util.Scanner;

public class TakingInput {

	static Scanner sc = new Scanner(System.in);

	void meth1() {
		System.out.println("meth1() called.");
		System.out.print("Enter first number: ");
		int x = sc.nextInt();
		System.out.println("User entered: " + x);

		System.out.print("Enter second number: ");
		int y = sc.nextInt();
		System.out.println("User entered: " + y);

		int z = x + y;
		System.out.println("\nThe value of z is: " + z);
	}

	String meth2(int i) {
		System.out.println("meth2() called.");

		if (i % 2 == 0) {
			System.out.println("if block executed.");
			System.out.println("Condition satisfied, Please give feedback: ");
			return sc.nextLine();
		} else {
			System.out.println("Else block executed.");
			System.out.println("Condition dissatisfied, Please give feedback: ");
			return sc.nextLine();
		}
	}

	void meth3(String name, String gender) {
		System.out.println("meth3() called.");
		switch (gender) {
		case "female":
			System.out.println("You are eligible for maternity leave.");
			break;

		case "male":
			System.out.println("You are eligible for paternity leave.");
			break;

		default:
			System.out.println("Invalid input, please enter valid input.");
			break;
		}
	}

	public static void main(String[] args) {
		TakingInput aobj = new TakingInput();
//		aobj.meth1();
//		System.out.println("===>" + aobj.meth2(5));
		System.out.print("What is your name? ");
		String uname = sc.next();
		System.out.print("What is you gender? ");
		String ugender = sc.next();
		aobj.meth3(uname, ugender);
	}
}
