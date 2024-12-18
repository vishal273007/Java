
// Java program to implement common array rules.

package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx02 {
	Scanner sc = new Scanner(System.in);

	void meth1() {
		System.out.println("meth1() called.");
		System.out.println("How many names do you want to store?");
		String names[] = new String[sc.nextInt()];

		System.out.println("Please enter" + names.length + " name ");

		for (int i = 0; i <= names.length - 1; i++) {
			names[i] = sc.next();
		}

		System.out.println("Element entered by the user: " + names);
		System.out.println("Elements entered by the user: " + Arrays.toString(names) + "\n");
		System.out.println("Retrieving data with for loop: ");

		for (int i = 0; i <= names.length - 1; i++) {
			System.out.print(names[i] + " ");
		}

		System.out.println("\nin reverse order: ");
		for (int i = names.length - 1; i >= 0; i--) {
			System.out.print(names[i] + " ");
		}

		System.out.println("\nUsing for-each loop: ");
		for (String data : names) {
			System.out.print(data + " ");
		}

	}

	public static void main(String[] args) {
		ArrayEx02 aobj = new ArrayEx02();
		aobj.meth1();
	}
}