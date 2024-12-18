
//Java program for input with an very important statement Integer.parshInt(); method.

package com.scannerclass.example;

import java.util.Scanner;

public class InputParseIntCoversion {

	static Scanner sc = new Scanner(System.in);

	void meth1() {
		System.out.print("Enter EmpName: ");
		String eName = sc.nextLine();

		System.out.print("Enter EmpId: ");
		int eId = Integer.parseInt(sc.nextLine());

		System.out.print("Enter EmpSal: ");
		int eSal = Integer.parseInt(sc.nextLine());

		System.out.print("Enter EmpAddress: ");
		String eAdd = sc.nextLine();

		System.out.println("\n");
		System.out.println("Ename: " + eName);
		System.out.println("EmpId: " + eId);
		System.out.println("EmpSal: " + eSal);
		System.out.println("EmpAddress " + eAdd);
	}

	public static void main(String[] args) {
		new InputParseIntCoversion().meth1();
	}
}