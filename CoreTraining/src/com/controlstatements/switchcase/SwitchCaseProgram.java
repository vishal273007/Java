
// Switch case program to understand practical working.
// Stop pouring and start drinking - stop watching and start practicing to code.

package com.controlstatements.switchcase;

public class SwitchCaseProgram {

	void meth1(String name, char gender, int age) {
		System.out.println("Switch case program execution");

		final int i = 40;
		// i++; // compile time error.
		byte b = 30;

		switch (b + 35 - 5) {
//			System.out.println("Not in any case statement.");
		case 10:
			System.out.println("Case 10 executed.");
			break;

		case 20:
			System.out.println("Case 20 executed.");
			break;

		case 'A' - 5:
			System.out.println("Case 60 executed.");
			System.out.println("int and char are compatible datatypes.");

			switch (gender) {
			case 'M', 'm':
				System.out.println("User is male.");
				if (age >= 29)
					System.out.println("Eligible.");
				else
					System.out.println("You need to wait " + (29 - age));
			case 'F', 'f':
				System.out.println("User is female.");
				if (age >= 26)
					System.out.println("Eligible.");
				else
					System.out.println("Not eligible.");
				break;
			default:
				System.out.println("Default case executed.");
				System.out.println("You have entered invalid data.");
				break;
			}
		}
		System.out.println("Compiler came out of switch case.");
	}

	public static void main(String[] args) {
		SwitchCaseProgram aobj = new SwitchCaseProgram();
		aobj.meth1("sujata", 'f', 23);
	}
}
